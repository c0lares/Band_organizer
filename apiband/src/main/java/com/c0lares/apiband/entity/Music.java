package com.c0lares.apiband.entity;

import jakarta.persistence.*;

@Entity
@Table(name="music")
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String musicName;

    @Column(name = "author_music")
    private String author_music;

    @ManyToOne
    @JoinColumn(name = "band_id", nullable = true)
    private Band band;

    public Music() {
    }

    public Music(String musicName, String author_music, Band band) {
        this.musicName = musicName;
        this.author_music = author_music;
        this.band = band;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getAuthor_music() {
        return author_music;
    }

    public void setAuthor_music(String author_music) {
        this.author_music = author_music;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }
}
