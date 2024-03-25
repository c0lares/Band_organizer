package com.c0lares.band_organizer.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "band")
public class Band {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "band_name", length = 50, nullable = false)
    private String bandName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date", nullable = false)
    @CreationTimestamp
    private Date creationDate;

    @OneToMany(mappedBy = "band", cascade = CascadeType.ALL)
    private List<Music> musics;

    public Band(String bandName) {
        this.bandName = bandName;
    }

    public Band() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
