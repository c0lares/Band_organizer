package com.c0lares.band_organizer.service;

import com.c0lares.band_organizer.model.Band;
import com.c0lares.band_organizer.model.Music;

import java.util.List;

public interface MusicService {

    List<Music> findByBand(Band band);

    

}
