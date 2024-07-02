package com.c0lares.apiband.service;

import com.c0lares.apiband.dao.BandRepository;
import com.c0lares.apiband.entity.Band;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BandServiceImpl implements BandService{

    private BandRepository bandRepository;

    @Autowired
    public BandServiceImpl(BandRepository bandRepository) {
        this.bandRepository = bandRepository;
    }

    @Override
    public List<Band> findAll() {
        return bandRepository.findAll();
    }

    @Override
    public Band findById(Long id) {
        Optional<Band> result = bandRepository.findById(id);


        if (result.isEmpty()){
           throw new RuntimeException("Did not find the employee id - " + id);
        }

        return result.get();
    }

    @Override
    public Boolean save(Band band) {
        try{
            bandRepository.save(band);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Boolean deleteById(Long id) {
        try{
            bandRepository.deleteById(id);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
