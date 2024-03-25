package com.c0lares.band_organizer.model;

import jakarta.persistence.*;

@Entity
@Table(name = "music")
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "music_name", nullable = false)
    private String musicName;

    @Column(name = "music_band")
    private String musicBand;

    @Column(name = "priority")
    private int priority;

    @Column(name = "ready", nullable = false)
    private Boolean ready;

    @ManyToOne
    @JoinColumn(name = "band_id")
    private Band band;

    public Music(String musicBand, int priority, Boolean ready) {
        this.musicBand = musicBand;
        this.priority = priority;
        this.ready = ready;
    }

    public Music() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMusicBand() {
        return musicBand;
    }

    public void setMusicBand(String musicBand) {
        this.musicBand = musicBand;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Boolean getReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }
}
