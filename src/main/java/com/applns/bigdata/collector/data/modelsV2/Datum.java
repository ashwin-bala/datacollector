
package com.applns.bigdata.collector.data.modelsV2;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "title", "main_reference_number", "date_start", "date_end", "date_display", "artist_display",
		"place_of_origin", "description", "dimensions", "inscriptions", "publication_history", "exhibition_history",
		"provenance_text", "artwork_type_title", "artwork_type_id", "gallery_title", "gallery_id", "department_title",
		"department_id", "artist_id", "artist_title", "style_id", "style_title", "classification_id",
		"classification_title", "material_id", "image_id", "source_updated_at", "updated_at", "timestamp" })

public class Datum {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("title")
	private String title;
	@JsonProperty("main_reference_number")
	private String mainReferenceNumber;
	@JsonProperty("date_display")
	private String dateDisplay;
	@JsonProperty("artist_display")
	private String artistDisplay;
	@JsonProperty("date_start")
	private Integer dateStart;
	@JsonProperty("date_end")
	private Integer dateEnd;
	@JsonProperty("place_of_origin")
	private String placeOfOrigin;
	@JsonProperty("description")
	private String description;
	@JsonProperty("dimensions_detail")
	private String dimensions;
	@JsonProperty("inscriptions")
	private String inscriptions;
	@JsonProperty("publication_history")
	private String publicationHistory;
	@JsonProperty("exhibition_history")
	private String exhibitionHistory;
	@JsonProperty("provenance_text")
	private String provenanceText;
	@JsonProperty("artwork_type_title")
	private String artworkTypeTitle;
	@JsonProperty("artwork_type_id")
	private Integer artworkTypeId;

	@JsonProperty("gallery_title")
	private String galleryTitle;
	@JsonProperty("gallery_id")
	private Integer galleryId;

	@JsonProperty("department_title")
	private String departmentTitle;
	@JsonProperty("department_id")
	private String departmentId;
	@JsonProperty("artist_id")
	private Integer artistId;
	@JsonProperty("artist_title")
	private String artistTitle;

	@JsonProperty("style_id")
	private String styleId;
	@JsonProperty("style_title")
	private String styleTitle;

	@JsonProperty("classification_id")
	private String classificationId;
	@JsonProperty("classification_title")
	private String classificationTitle;

	@JsonProperty("material_id")
	private String materialId;
	@JsonProperty("image_id")
	private String imageId;

	@JsonProperty("source_updated_at")
	private String sourceUpdatedAt;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("timestamp")
	private String timestamp;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("material_id")
	public String getMaterialId() {
		return materialId;
	}

	@JsonProperty("material_id")
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("main_reference_number")
	public String getMainReferenceNumber() {
		return mainReferenceNumber;
	}

	@JsonProperty("main_reference_number")
	public void setMainReferenceNumber(String mainReferenceNumber) {
		this.mainReferenceNumber = mainReferenceNumber;
	}

	@JsonProperty("date_display")
	public String getDateDisplay() {
		return dateDisplay;
	}

	@JsonProperty("date_display")
	public void setDateDisplay(String dateDisplay) {
		this.dateDisplay = dateDisplay;
	}

	@JsonProperty("artist_display")
	public String getArtistDisplay() {
		return artistDisplay;
	}

	@JsonProperty("artist_display")
	public void setArtistDisplay(String artistDisplay) {
		this.artistDisplay = artistDisplay;
	}

	@JsonProperty("date_start")
	public Integer getDateStart() {
		return dateStart;
	}

	@JsonProperty("date_start")
	public void setDateStart(Integer dateStart) {
		this.dateStart = dateStart;
	}

	@JsonProperty("date_end")
	public Integer getDateEnd() {
		return dateEnd;
	}

	@JsonProperty("date_end")
	public void setDateEnd(Integer dateEnd) {
		this.dateEnd = dateEnd;
	}

	@JsonProperty("place_of_origin")
	public String getPlaceOfOrigin() {
		return placeOfOrigin;
	}

	@JsonProperty("place_of_origin")
	public void setPlaceOfOrigin(String placeOfOrigin) {
		this.placeOfOrigin = placeOfOrigin;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("publication_history")
	public String getPublicationHistory() {
		return publicationHistory;
	}

	@JsonProperty("publication_history")
	public void setPublicationHistory(String publicationHistory) {
		this.publicationHistory = publicationHistory;
	}

	@JsonProperty("exhibition_history")
	public String getExhibitionHistory() {
		return exhibitionHistory;
	}

	@JsonProperty("exhibition_history")
	public void setExhibitionHistory(String exhibitionHistory) {
		this.exhibitionHistory = exhibitionHistory;
	}

	@JsonProperty("provenance_text")
	public String getProvenanceText() {
		return provenanceText;
	}

	@JsonProperty("provenance_text")
	public void setProvenanceText(String provenanceText) {
		this.provenanceText = provenanceText;
	}

	@JsonProperty("inscriptions")
	public String getInscriptions() {
		return inscriptions;
	}

	@JsonProperty("inscriptions")
	public void setInscriptions(String inscriptions) {
		this.inscriptions = inscriptions;
	}

	@JsonProperty("dimensions")
	public String getDimensions() {
		return dimensions;
	}

	@JsonProperty("dimensions")
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	@JsonProperty("gallery_title")
	public String getGalleryTitle() {
		return galleryTitle;
	}

	@JsonProperty("gallery_title")
	public void setGalleryTitle(String galleryTitle) {
		this.galleryTitle = galleryTitle;
	}

	@JsonProperty("gallery_id")
	public Integer getGalleryId() {
		return galleryId;
	}

	@JsonProperty("gallery_id")
	public void setGalleryId(Integer galleryId) {
		this.galleryId = galleryId;
	}

	@JsonProperty("artwork_type_title")
	public String getArtworkTypeTitle() {
		return artworkTypeTitle;
	}

	@JsonProperty("artwork_type_title")
	public void setArtworkTypeTitle(String artworkTypeTitle) {
		this.artworkTypeTitle = artworkTypeTitle;
	}

	@JsonProperty("artwork_type_id")
	public Integer getArtworkTypeId() {
		return artworkTypeId;
	}

	@JsonProperty("artwork_type_id")
	public void setArtworkTypeId(Integer artworkTypeId) {
		this.artworkTypeId = artworkTypeId;
	}

	@JsonProperty("department_title")
	public String getDepartmentTitle() {
		return departmentTitle;
	}

	@JsonProperty("department_title")
	public void setDepartmentTitle(String departmentTitle) {
		this.departmentTitle = departmentTitle;
	}

	@JsonProperty("department_id")
	public String getDepartmentId() {
		return departmentId;
	}

	@JsonProperty("department_id")
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@JsonProperty("artist_id")
	public Integer getArtistId() {
		return artistId;
	}

	@JsonProperty("artist_id")
	public void setArtistId(Integer artistId) {
		this.artistId = artistId;
	}

	@JsonProperty("artist_title")
	public String getArtistTitle() {
		return artistTitle;
	}

	@JsonProperty("artist_title")
	public void setArtistTitle(String artistTitle) {
		this.artistTitle = artistTitle;
	}

	@JsonProperty("style_id")
	public String getStyleId() {
		return styleId;
	}

	@JsonProperty("style_id")
	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}

	@JsonProperty("style_title")
	public String getStyleTitle() {
		return styleTitle;
	}

	@JsonProperty("style_title")
	public void setStyleTitle(String styleTitle) {
		this.styleTitle = styleTitle;
	}

	@JsonProperty("classification_id")
	public String getClassificationId() {
		return classificationId;
	}

	@JsonProperty("classification_id")
	public void setClassificationId(String classificationId) {
		this.classificationId = classificationId;
	}

	@JsonProperty("classification_title")
	public String getClassificationTitle() {
		return classificationTitle;
	}

	@JsonProperty("classification_title")
	public void setClassificationTitle(String classificationTitle) {
		this.classificationTitle = classificationTitle;
	}

	@JsonProperty("source_updated_at")
	public String getSourceUpdatedAt() {
		return sourceUpdatedAt;
	}

	@JsonProperty("source_updated_at")
	public void setSourceUpdatedAt(String sourceUpdatedAt) {
		this.sourceUpdatedAt = sourceUpdatedAt;
	}

	@JsonProperty("updated_at")
	public String getUpdatedAt() {
		return updatedAt;
	}

	@JsonProperty("updated_at")
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	@JsonProperty("timestamp")
	public String getTimestamp() {
		return timestamp;
	}

	@JsonProperty("timestamp")
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@JsonProperty("image_id")
	public String getImageId() {
		return imageId;
	}

	@JsonProperty("image_id")
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

}
