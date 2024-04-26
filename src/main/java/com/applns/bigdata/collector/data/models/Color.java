
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
    "h",
    "l",
    "s",
    "percentage",
    "population"
})
@Generated("jsonschema2pojo")
public class Color {

    @JsonProperty("h")
    private Integer h;
    @JsonProperty("l")
    private Integer l;
    @JsonProperty("s")
    private Integer s;
    @JsonProperty("percentage")
    private Double percentage;
    @JsonProperty("population")
    private Integer population;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("h")
    public Integer getH() {
        return h;
    }

    @JsonProperty("h")
    public void setH(Integer h) {
        this.h = h;
    }

    @JsonProperty("l")
    public Integer getL() {
        return l;
    }

    @JsonProperty("l")
    public void setL(Integer l) {
        this.l = l;
    }

    @JsonProperty("s")
    public Integer getS() {
        return s;
    }

    @JsonProperty("s")
    public void setS(Integer s) {
        this.s = s;
    }

    @JsonProperty("percentage")
    public Double getPercentage() {
        return percentage;
    }

    @JsonProperty("percentage")
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @JsonProperty("population")
    public Integer getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(Integer population) {
        this.population = population;
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
