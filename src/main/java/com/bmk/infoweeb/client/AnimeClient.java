package com.bmk.infoweeb.client;

import com.bmk.infoweeb.config.LocalConfig;
import com.bmk.infoweeb.model.AllAnimeModel;
import com.bmk.infoweeb.model.AnimeModel;
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

    public List<AnimeModel> getAnimeBy(String category, String page, String type){

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




}


