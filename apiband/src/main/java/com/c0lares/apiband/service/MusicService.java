package com.c0lares.apiband.service;

import java.util.List;

import com.c0lares.apiband.entity.Music;

public interface MusicService {

    List<Music> findAll();

    Music findById(Long id);

    Boolean save(Music music);

    Boolean deleteById(Long id);

}
