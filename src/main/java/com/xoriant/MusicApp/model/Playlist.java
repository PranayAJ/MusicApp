package com.xoriant.MusicApp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Playlist {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pId;
	String pName;
	
	@ManyToOne
	@JoinColumn(name="userId")
	User user;
	
	@OneToMany
	@JoinColumn(name="songId")
	List<Song> song;
}
