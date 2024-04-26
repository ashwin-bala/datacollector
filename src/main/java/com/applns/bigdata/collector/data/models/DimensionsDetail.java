
package com.applns.bigdata.collector.data.models;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "depth_cm",
    "depth_in",
    "width_cm",
    "width_in",
    "height_cm",
    "height_in",
    "diameter_cm",
    "diameter_in",
    "clarification"
})
@Generated("jsonschema2pojo")
public class DimensionsDetail {

    @JsonProperty("depth_cm")
    private Integer depthCm;
    @JsonProperty("depth_in")
    private Integer depthIn;
    @JsonProperty("width_cm")
    private Integer widthCm;
    @JsonProperty("width_in")
    private Integer widthIn;
    @JsonProperty("height_cm")
    private Integer heightCm;
    @JsonProperty("height_in")
    private Integer heightIn;
    @JsonProperty("diameter_cm")
    private Double diameterCm;
    @JsonProperty("diameter_in")
    private Double diameterIn;
    @JsonProperty("clarification")
    private Object clarification;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("depth_cm")
    public Integer getDepthCm() {
        return depthCm;
    }

    @JsonProperty("depth_cm")
    public void setDepthCm(Integer depthCm) {
        this.depthCm = depthCm;
    }

    @JsonProperty("depth_in")
    public Integer getDepthIn() {
        return depthIn;
    }

    @JsonProperty("depth_in")
    public void setDepthIn(Integer depthIn) {
        this.depthIn = depthIn;
    }

    @JsonProperty("width_cm")
    public Integer getWidthCm() {
        return widthCm;
    }

    @JsonProperty("width_cm")
    public void setWidthCm(Integer widthCm) {
        this.widthCm = widthCm;
    }

    @JsonProperty("width_in")
    public Integer getWidthIn() {
        return widthIn;
    }

    @JsonProperty("width_in")
    public void setWidthIn(Integer widthIn) {
        this.widthIn = widthIn;
    }

    @JsonProperty("height_cm")
    public Integer getHeightCm() {
        return heightCm;
    }

    @JsonProperty("height_cm")
    public void setHeightCm(Integer heightCm) {
        this.heightCm = heightCm;
    }

    @JsonProperty("height_in")
    public Integer getHeightIn() {
        return heightIn;
    }

    @JsonProperty("height_in")
    public void setHeightIn(Integer heightIn) {
        this.heightIn = heightIn;
    }

    @JsonProperty("diameter_cm")
    public Double getDiameterCm() {
        return diameterCm;
    }

    @JsonProperty("diameter_cm")
    public void setDiameterCm(Double diameterCm) {
        this.diameterCm = diameterCm;
    }

    @JsonProperty("diameter_in")
    public Double getDiameterIn() {
        return diameterIn;
    }

    @JsonProperty("diameter_in")
    public void setDiameterIn(Double diameterIn) {
        this.diameterIn = diameterIn;
    }

    @JsonProperty("clarification")
    public Object getClarification() {
        return clarification;
    }

    @JsonProperty("clarification")
    public void setClarification(Object clarification) {
        this.clarification = clarification;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
