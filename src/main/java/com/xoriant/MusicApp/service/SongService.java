package com.xoriant.MusicApp.service;

import java.util.List;
import java.util.Optional;

import com.xoriant.MusicApp.model.Song;

public interface SongService {

	//Adding song
	void addSong(Song song);
	
	//Get All Songs
	List<Song> getSongs();
	
	//Search
		//Get Song by Id
		Optional<Song> getSongById(int id);
		//Get Song by Song name
		Song getSongByName(String name);
	
	//Update Song
	void updateSong(Song song);
//		// Update a song by Id
//		void updateSongById(int id);
//		// Update song by name
//		void updateSongByName(String name);
	
	//Delete Song
	void deleteSong(int id);
	
}
