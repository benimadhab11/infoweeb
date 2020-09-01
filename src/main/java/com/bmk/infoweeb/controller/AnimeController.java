package com.bmk.infoweeb.controller;

import com.bmk.infoweeb.client.AnimeClient;
import com.bmk.infoweeb.dto.AnimeDetailDTO;
import com.bmk.infoweeb.dto.AnimeDTO;
import com.bmk.infoweeb.dto.BaseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("anime")
public class AnimeController {

    @Autowired
    public AnimeClient animeClient;


    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/{category}/{page}/{type}")
    public List<AnimeDTO> getAllAnimeBy(@PathVariable String category, @PathVariable String page, @PathVariable String type) {

        return animeClient.getAnimeListBy(category, page, type);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/{mal_id}")
    public AnimeDetailDTO getEachAnime(@PathVariable String mal_id) {

        return animeClient.getAnimeByMalId(mal_id);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/{mal_id}/{detail_type}")
    public BaseDTO getDetails(@PathVariable String mal_id, @PathVariable String detail_type) {

        return animeClient.getAnimeDetails(mal_id, detail_type);


    }



}