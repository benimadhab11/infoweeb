package com.bmk.infoweeb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class AllAnimeModel {

    @JsonIgnore
    private String request_hash;
    @JsonIgnore
    private String request_cached;
    @JsonIgnore
    private int request_cache_expiry;

    @JsonProperty("top")
    private List<AnimeModel> animeModels;

    public String getRequest_hash() {
        return request_hash;
    }

    public void setRequest_hash(String request_hash) {
        this.request_hash = request_hash;
    }

    public String getRequest_cached() {
        return request_cached;
    }

    public void setRequest_cached(String request_cached) {
        this.request_cached = request_cached;
    }

    public int getRequest_cache_expiry() {
        return request_cache_expiry;
    }

    public void setRequest_cache_expiry(int request_cache_expiry) {
        this.request_cache_expiry = request_cache_expiry;
    }

    public List<AnimeModel> getAnimeModels() {
        return animeModels;
    }

    public void setAnimeModels(List<AnimeModel> animeModels) {
        this.animeModels = animeModels;
    }
}
