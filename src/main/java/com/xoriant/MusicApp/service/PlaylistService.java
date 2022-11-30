package com.xoriant.MusicApp.service;

import java.util.List;
import java.util.Optional;

import com.xoriant.MusicApp.model.Playlist;

public interface PlaylistService {
void addPlaylist(Playlist playlist);
	
	//Get All Playlists
	List<Playlist> getPlaylists();
	
	//Search
		//Get Playlist by Id
		Optional<Playlist> getPlaylistById(int id);
		//Get Playlist by Playlist name
		Playlist getPlaylistByName(String name);
	
	//Update Playlist
	void updatePlaylist(Playlist playlist);
//		// Update a Playlist by Id
//		void updatePlaylistById(int id);
//		// Update Playlist by name
//		void updatePlaylistByName(String name);
	
	//Delete Playlist
	void deletePlaylist(int id);
}
