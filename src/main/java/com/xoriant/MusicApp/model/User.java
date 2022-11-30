package com.xoriant.MusicApp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table
@Data
public class User {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int userId;
	
	String uName;
	
	String uemail;
	
	String upassword;
	
	Boolean isAdmin;
	
	@JsonIgnore
	@OneToMany(mappedBy="user", cascade = CascadeType.PERSIST, orphanRemoval=true)
	List<Playlist> playlist;
	
}
