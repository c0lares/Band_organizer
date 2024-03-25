package com.c0lares.band_organizer.service;

import com.c0lares.band_organizer.model.Band;
import com.c0lares.band_organizer.model.Music;

import java.util.List;

public interface BandService {

    List<Band> findAll();

    Band findById(int id);

    Band save(Band band);

    List<Music> findMusicByBand(Integer band);
}
