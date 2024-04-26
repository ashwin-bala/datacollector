
package com.applns.bigdata.collector.data.models;

import java.util.LinkedHashMap;
import java.util.List;
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
    "input",
    "contexts",
    "weight"
})
@Generated("jsonschema2pojo")
public class SuggestAutocompleteAll {

    @JsonProperty("input")
    private List<String> input;
    @JsonProperty("contexts")
    private Contexts contexts;
    @JsonProperty("weight")
    private Integer weight;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("input")
    public List<String> getInput() {
        return input;
    }

    @JsonProperty("input")
    public void setInput(List<String> input) {
        this.input = input;
    }

    @JsonProperty("contexts")
    public Contexts getContexts() {
        return contexts;
    }

    @JsonProperty("contexts")
    public void setContexts(Contexts contexts) {
        this.contexts = contexts;
    }

    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
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
