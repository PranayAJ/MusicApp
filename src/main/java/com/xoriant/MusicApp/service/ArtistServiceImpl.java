package com.xoriant.MusicApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.MusicApp.model.Artist;
import com.xoriant.MusicApp.repository.ArtistRepository;

@Service
public class ArtistServiceImpl implements ArtistService {

	@Autowired
	private ArtistRepository artistRepository;
	
	@Override
	public void addArtist(Artist Artist) {
		// TODO Auto-generated method stub
		artistRepository.save(Artist);
	}

	@Override
	public List<Artist> getArtists() {
		return artistRepository.findAll();
	}

	@Override
	public Optional<Artist> getArtistById(int id) {
		// TODO Auto-generated method stub
		return artistRepository.findById(id);
	}

	@Override
	public Artist getArtistByName(String name) {
		// TODO Auto-generated method stub
		return artistRepository.findAllByName(name);
	}

	@Override
	public void updateArtist(Artist Artist) {
		// TODO Auto-generated method stub
		artistRepository.save(Artist);
	}

	@Override
	public void deleteArtist(int id) {
		// TODO Auto-generated method stub
		artistRepository.deleteById(id);
	}


}
