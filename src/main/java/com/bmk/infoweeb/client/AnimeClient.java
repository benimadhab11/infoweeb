package com.bmk.infoweeb.client;

import com.bmk.infoweeb.config.LocalConfig;
import com.bmk.infoweeb.model.*;
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

    public List<AnimeModel> getAnimeListBy(String category, String page, String type){

        String urlPath = localConfig.getUrl()
                                    .concat("/")
                                    .concat(category)
                                    .concat("/anime/")
                                    .concat(page)
                                    .concat("/")
                                    .concat(type);

        AllAnimeModel result = restTemplate.getForObject(urlPath, AllAnimeModel.class);
        return result.getAnimeModels();
    }

    public AnimeDetailModel getAnimeByMalId(String mal_id){
        String urlPath = localConfig.getUrl()
                .concat("/anime/")
                .concat(mal_id);

        AnimeDetailModel result = restTemplate.getForObject(urlPath, AnimeDetailModel.class);
        return result;

    }

    public Model getAnimeDetails(String mal_id, String details){
        String urlPath = localConfig.getUrl()
                .concat("/anime/")
                .concat(mal_id)
                .concat("/")
                .concat(details);
        switch(details){
            case "episodes":
                AllEpisodeModel result = restTemplate.getForObject(urlPath, AllEpisodeModel.class);
                return result;
            default:
                Model modelResult = restTemplate.getForObject(urlPath, Model.class);
                return modelResult;
        }

    }





}


