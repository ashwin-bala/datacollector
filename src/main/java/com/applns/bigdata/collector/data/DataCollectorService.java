package com.applns.bigdata.collector.data;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.applns.bigdata.collector.data.models.Artworks;
import com.applns.bigdata.collector.data.models.Datum;

@Service
public class DataCollectorService {
	
	private static final Logger log = LoggerFactory.getLogger(DataCollectorService.class);

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public void fetchDataFromApi() {
		
		log.info("Data Collector Service Processing started: ");
		String url = getNextPageFromDB();

		if (url == null) {
			url = "https://api.artic.edu/api/v1/artworks?limit=25";
			log.info(" Next Page Url in the DB is not present ");
		}

		log.info(" Next Page Url: " + url);

		Artworks artWorks = restTemplate.getForObject(url, Artworks.class);

		insertArtworkState(artWorks);

		artWorks.getData().forEach(it -> {
			// log.info(it.toString());
		});
		insertDatumObjects(artWorks);
		queryTable();
		
	}
	
	protected void insertArtworkState(Artworks artWorks) {
		String sql = "INSERT INTO public.artworkstate" + "(url)" + " VALUES (?)";
		jdbcTemplate.update(sql, artWorks.getPagination().getNextUrl());
	}

	protected String getNextPageFromDB() {
		List<Map<String, String>> list = runQuery();
		if (list != null && list.size() > 0) {
			String val = list.get(0).get("url");
			log.info("Next REST API to call :" + val);
			return val;
		}
		return null;
	}

	public List<Map<String, String>> runQuery() {
		return jdbcTemplate.query("SELECT * FROM public.artworkstate ORDER BY createts DESC LIMIT 1 OFFSET 0",
				new RowMapper<Map<String, String>>() {
					@Override
					public Map<String, String> mapRow(ResultSet rs, int rowNum) throws SQLException {
						ResultSetMetaData metaData = rs.getMetaData();
						int columnCount = metaData.getColumnCount();
						Map<String, String> row = new HashMap<>();
						for (int i = 1; i <= columnCount; i++) {
							String columnName = metaData.getColumnName(i);
							String columnValue = rs.getString(i);
							row.put(columnName, columnValue);
						}
						return row;
					}
				});
	}

	protected void insertDatumObjects(Artworks artWorks) {
		String sql = "INSERT INTO public.datum"
				+ "(idnum, title, main_reference_number, date_display, date_start, date_end, place_of_origin, description, inscriptions, publication_history, exhibition_history, provenance_text, artwork_type_title, artwork_type_id, gallery_title, gallery_id, department_title, department_id, artist_id, artist_title, style_id, style_title, classification_id, classification_title, material_id, image_id, source_updated_at, updated_at, timestampstr)"
				+ " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

//		removeDupes(artWorks);
		removeDupes(artWorks).forEach(it -> {
			log.info(it.toString());
			jdbcTemplate.update(sql, it.getId(), it.getTitle(), it.getMainReferenceNumber(), it.getDateDisplay(),
					it.getDateStart(), it.getDateEnd(), it.getPlaceOfOrigin(), it.getDescription(),
					it.getInscriptions(), it.getPublicationHistory(), it.getExhibitionHistory(), it.getProvenanceText(),
					it.getArtworkTypeTitle(), it.getArtworkTypeId(), it.getGalleryTitle(), it.getGalleryId(),
					it.getDepartmentTitle(), it.getDepartmentId(), it.getArtistId(), it.getArtistTitle(),
					it.getStyleId(), it.getStyleTitle(), it.getClassificationId(), it.getClassificationTitle(),
					it.getMaterialId(), it.getImageId(), it.getSourceUpdatedAt(), it.getUpdatedAt(), it.getTimestamp());
		});

	}

	private List<Datum> removeDupes(Artworks artWorks) {
		List<Datum> datums = artWorks.getData().stream()
				.collect(Collectors.groupingBy(Datum::getTitle, Collectors.maxBy(Comparator.comparing(Datum::getId))))
				.values().stream().map(Optional::get).collect(Collectors.toList());
		return datums;
	}

	private void queryTable() {
		String sql = "SELECT * FROM public.datum";
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

		// Process the query results
		for (Map<String, Object> row : rows) {
			// Access the values using column names
			Object value1 = row.get("id");
			Object value2 = row.get("main_reference_number");
			log.info("------" + value2 + "=========" + value1);
		}
	}

}
