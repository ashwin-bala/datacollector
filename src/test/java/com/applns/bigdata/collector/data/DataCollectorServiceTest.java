package com.applns.bigdata.collector.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.client.RestTemplate;

import com.applns.bigdata.collector.data.models.Artworks;
import com.applns.bigdata.collector.data.models.Datum;
import com.applns.bigdata.collector.data.models.Pagination;

@ExtendWith(MockitoExtension.class)
public class DataCollectorServiceTest {
	
	@Mock
	private JdbcTemplate jdbcTemplate;
	
	@Mock
	private RestTemplate restTemplate;

    @InjectMocks
    private DataCollectorService collectorService;
    
    @BeforeAll
    public static void beforeAll() {
        MockitoAnnotations.openMocks(DataCollectorServiceTest.class);
    }
    
    @Test
    public void testRunQueryUsingMocks() {
    	List<Map<String,String>> sd = new ArrayList<>();
        Mockito.when(this.jdbcTemplate.query(Mockito.any(String.class),Mockito.any(org.springframework.jdbc.core.RowMapper.class)))
        .thenReturn(sd);

        this.collectorService.runQuery();

        Mockito.verify(this.jdbcTemplate, Mockito.times(1))
        .query(Mockito.any(String.class),Mockito.any(org.springframework.jdbc.core.RowMapper.class));
    }
    
    @Test
    public void testGetNextPageFromDB() {
    	// Arrange
        String urlFromDB = "https://api.artic.edu/api/v1/artworks?limit=25";
        Artworks mockArtworks = new Artworks();
        List<Datum> datums = new ArrayList<Datum>();
        Pagination page = new Pagination();
        page.setNextUrl("foobar");
        mockArtworks.setPagination(page);
        mockArtworks.setData(datums);
        
        // Mock restTemplate.getForObject() to return mockArtworks
        Mockito.when(this.restTemplate.getForObject(urlFromDB, Artworks.class)).thenReturn(mockArtworks);

        // Act
        collectorService.fetchDataFromApi();

        Mockito.verify(restTemplate, Mockito.times(1)).getForObject(Mockito.anyString(), Mockito.any());

    }
    

}
