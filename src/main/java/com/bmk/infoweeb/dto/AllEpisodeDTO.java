package com.bmk.infoweeb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class AllEpisodeDTO extends BaseDTO {

    @JsonProperty("episodes")
    private List<EpisodeDTO> episodeDTOS;

    public List<EpisodeDTO> getEpisodeModels() {
        return episodeDTOS;
    }

    public void setEpisodeModels(List<EpisodeDTO> episodeDTOS) {
        this.episodeDTOS = episodeDTOS;
    }
}
