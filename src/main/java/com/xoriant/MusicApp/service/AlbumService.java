package com.xoriant.MusicApp.service;

import java.util.List;
import java.util.Optional;

import com.xoriant.MusicApp.model.Album;

public interface AlbumService {
	void addAlbum(Album album);
	
	//Get All Albums
	List<Album> getAlbums();
	
	//Search
		//Get Album by Id
		Optional<Album> getAlbumById(int id);
		//Get Album by Album name
		Album getAlbumByName(String name);
	
	//Update Album
	void updateAlbum(Album Album);
//		// Update a Album by Id
//		void updateAlbumById(int id);
//		// Update Album by name
//		void updateAlbumByName(String name);
	
	//Delete Album
	void deleteAlbum(int id);

}
