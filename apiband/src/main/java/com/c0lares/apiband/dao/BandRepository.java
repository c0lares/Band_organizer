package com.c0lares.apiband.dao;

import com.c0lares.apiband.entity.Band;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BandRepository extends JpaRepository<Band, Long> {
}
