package com.c0lares.apiband.dao;

import com.c0lares.apiband.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music, Long> {
}
