package com.xoriant.MusicApp.service;

import java.util.List;
import java.util.Optional;

import com.xoriant.MusicApp.model.Artist;

public interface ArtistService {

		void addArtist(Artist artist);
		
		//Get All Artists
		List<Artist> getArtists();
		
		//Search
			//Get Artist by Id
			Optional<Artist> getArtistById(int id);
			//Get Artist by Artist name
			Artist getArtistByName(String name);
		
		//Update Artist
		void updateArtist(Artist artist);
//			// Update a Artist by Id
//			void updateArtistById(int id);
//			// Update Artist by name
//			void updateArtistByName(String name);
		
		//Delete Artist
		void deleteArtist(int id);

}
