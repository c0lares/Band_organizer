package com.c0lares.band_organizer.service;

import com.c0lares.band_organizer.model.Band;
import com.c0lares.band_organizer.model.Music;
import com.c0lares.band_organizer.repository.BandRepository;
import com.c0lares.band_organizer.repository.MusicRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BandServiceImpl implements BandService{

    private final BandRepository bandRepository;

    private final MusicRepository musicRepository;

    // a anotacao Autowired nao e necessaria, pois so existe um construtor
    @Autowired
    public BandServiceImpl(BandRepository bandRepository, MusicRepository musicRepository) {
        this.bandRepository = bandRepository;
        this.musicRepository = musicRepository;
    }

    @Override
    public List<Band> findAll() {
        return this.bandRepository.findAll();
    }

    @Override
    public Band findById(int id) {
        return null;
    }

    @Override
    public Band save(Band band) {
        return null;
    }

    @Override
    public List<Music> findMusicByBand(Integer band_id) {
        return bandRepository.findAllMusicsByBandId(band_id);
    }
}
