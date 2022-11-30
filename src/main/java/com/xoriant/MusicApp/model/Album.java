package com.xoriant.MusicApp.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Table
@Data
public class Album {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int albumId;
	
	@Column
	String albumName;
	
	@JsonManagedReference
	@OneToMany(mappedBy="album", cascade = CascadeType.PERSIST, orphanRemoval = true)
	List<Song> song;
	
	@OneToOne
	@JoinColumn(name="artistId")
	Artist artist;
	
	@Column
	Date releasedOn;
}
