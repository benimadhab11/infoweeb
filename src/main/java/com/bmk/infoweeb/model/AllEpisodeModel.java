package com.bmk.infoweeb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class AllEpisodeModel extends Model{

    @JsonProperty("episodes")
    private List<EpisodeModel> episodeModels;

    public List<EpisodeModel> getEpisodeModels() {
        return episodeModels;
    }

    public void setEpisodeModels(List<EpisodeModel> episodeModels) {
        this.episodeModels = episodeModels;
    }
}
