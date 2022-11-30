package com.xoriant.MusicApp.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Table
@Data
public class Song {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int songId;
	
	@Column
	String songName;
	
	@ManyToOne
	@JoinColumn(name="artistId")
	Artist artist;
	
	@Column
	String genre;
	
	@Column
	Time time;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="albumId")
	Album album;
}
