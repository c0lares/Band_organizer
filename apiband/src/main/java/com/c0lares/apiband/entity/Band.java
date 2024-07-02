package com.c0lares.apiband.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="band")
public class Band {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="band_name")
    private String bandName;

    @OneToMany(mappedBy="band")
    private Set<Music> music;

    public Band() {
    }

    public Band(String bandName, Set<Music> music) {
        this.bandName = bandName;
        this.music = music;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public Set<Music> getMusic() {
        return music;
    }

    public void setMusic(Set<Music> music) {
        this.music = music;
    }
}
