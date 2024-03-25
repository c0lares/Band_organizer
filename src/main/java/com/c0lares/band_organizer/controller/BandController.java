package com.c0lares.band_organizer.controller;


import com.c0lares.band_organizer.model.Band;
import com.c0lares.band_organizer.model.Music;
import com.c0lares.band_organizer.service.BandService;
import com.c0lares.band_organizer.service.MusicService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/band")
public class BandController {

    private BandService bandService;

    public BandController(BandService bandService) {
        this.bandService = bandService;
    }

    @GetMapping("/list")
    public String findAll(Model model){

        List<Band> bands = bandService.findAll();

        model.addAttribute("bands", bands);

        return "/bands/list-bands";

    }

    @GetMapping("/musics")
    public String findMusicsByBand(@RequestParam("bandId") int id, Model model){

        List<Music> musics = bandService.findMusicByBand(id);

        model.addAttribute("musics", musics);

        return "/bands/band-card";
    }


//    public String
}
