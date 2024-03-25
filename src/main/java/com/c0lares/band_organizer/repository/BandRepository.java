package com.c0lares.band_organizer.repository;

import com.c0lares.band_organizer.model.Band;
import com.c0lares.band_organizer.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BandRepository extends JpaRepository<Band, Integer> {

    @Query("SELECT m FROM Music m WHERE m.band.id = :bandId")
    List<Music> findAllMusicsByBandId(int bandId);
}
