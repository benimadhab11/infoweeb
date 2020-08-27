package com.bmk.infoweeb.controller;

import com.bmk.infoweeb.client.AnimeClient;
import com.bmk.infoweeb.model.AllAnimeModel;
import com.bmk.infoweeb.model.AnimeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
public class AnimeController {

    @Autowired
    public AnimeClient animeClient;


    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/anime/{category}/{page}/{type}")
    public List<AnimeModel> anime(@PathVariable String category, @PathVariable String page, @PathVariable String type) {

        return animeClient.getAnimeBy(category, page, type);
    }


}