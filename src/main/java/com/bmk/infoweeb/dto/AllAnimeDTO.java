package com.bmk.infoweeb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class AllAnimeDTO extends BaseDTO {
    @JsonProperty("top")
    private List<AnimeDTO> animeDTOS;

    public List<AnimeDTO> getAnimeModels() {
        return animeDTOS;
    }

    public void setAnimeModels(List<AnimeDTO> animeDTOS) {
        this.animeDTOS = animeDTOS;
    }
}
