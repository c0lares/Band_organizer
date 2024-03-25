package com.c0lares.band_organizer.repository;

import com.c0lares.band_organizer.model.Band;
import com.c0lares.band_organizer.model.Music;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music, Integer> {

    List<Music> findByBand(Band band);

}
