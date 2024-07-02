package com.c0lares.apiband.service;

import com.c0lares.apiband.entity.Band;

import java.util.List;

public interface BandService {

    List<Band> findAll();

    Band findById(Long id);

    Boolean save(Band band);

    Boolean deleteById(Long id);

}
