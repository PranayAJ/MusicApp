package com.xoriant.MusicApp.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table
@Data
public class Artist {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int artistId;
	
	@Column
	String artistName;
	
	@JsonIgnore
	@OneToMany
	List<Song> song;
	
	@JsonIgnore
	@OneToMany(mappedBy = "artist", cascade = CascadeType.PERSIST, orphanRemoval=true)
	List<Album> album;
	
	@Column
	Date birthDate;
}
