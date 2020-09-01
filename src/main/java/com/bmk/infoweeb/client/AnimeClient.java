package com.bmk.infoweeb.client;

import com.bmk.infoweeb.config.LocalConfig;
import com.bmk.infoweeb.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class AnimeClient {
    @Autowired
    private LocalConfig localConfig;

    @Autowired
    private RestTemplate restTemplate;

    public List<AnimeDTO> getAnimeListBy(String category, String page, String type){

        String urlPath = localConfig.getUrl()
                                    .concat("/")
                                    .concat(category)
                                    .concat("/anime/")
                                    .concat(page)
                                    .concat("/")
                                    .concat(type);

        AllAnimeDTO result = restTemplate.getForObject(urlPath, AllAnimeDTO.class);
        return result.getAnimeModels();
    }

    public AnimeDetailDTO getAnimeByMalId(String mal_id){
        String urlPath = localConfig.getUrl()
                .concat("/anime/")
                .concat(mal_id);

        AnimeDetailDTO result = restTemplate.getForObject(urlPath, AnimeDetailDTO.class);
        return result;

    }

    public BaseDTO getAnimeDetails(String mal_id, String details){
        String urlPath = localConfig.getUrl()
                .concat("/anime/")
                .concat(mal_id)
                .concat("/")
                .concat(details);
        switch(details){
            case "episodes":
                AllEpisodeDTO result = restTemplate.getForObject(urlPath, AllEpisodeDTO.class);
                return result;
            default:
                BaseDTO baseDTOResult = restTemplate.getForObject(urlPath, BaseDTO.class);
                return baseDTOResult;
        }

    }





}


