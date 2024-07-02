package com.c0lares.apiband.service;

import com.c0lares.apiband.dao.MusicRepository;
import com.c0lares.apiband.entity.Music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicServiceImpl implements MusicService{

    private MusicRepository musicRepository;

    @Autowired
    public MusicServiceImpl(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public Music findById(Long id) {
        Optional<Music> result = musicRepository.findById(id);


        if (result.isEmpty()){
           throw new RuntimeException("Did not find the employee id - " + id);
        }

        return result.get();
    }

    @Override
    public Boolean save(Music music) {
        try{
            musicRepository.save(music);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Boolean deleteById(Long id) {
        try{
            musicRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
