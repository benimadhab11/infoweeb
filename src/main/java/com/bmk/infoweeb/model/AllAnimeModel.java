package com.bmk.infoweeb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class AllAnimeModel extends Model{
    @JsonProperty("top")
    private List<AnimeModel> animeModels;

    public List<AnimeModel> getAnimeModels() {
        return animeModels;
    }

    public void setAnimeModels(List<AnimeModel> animeModels) {
        this.animeModels = animeModels;
    }
}
