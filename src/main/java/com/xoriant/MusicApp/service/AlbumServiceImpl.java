package com.xoriant.MusicApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.MusicApp.model.Album;
import com.xoriant.MusicApp.repository.AlbumRepository;

@Service
public class AlbumServiceImpl implements AlbumService {

	@Autowired
	private AlbumRepository albumRepository;
	
	@Override
	public void addAlbum(Album Album) {
		// TODO Auto-generated method stub
		albumRepository.save(Album);
	}

	@Override
	public List<Album> getAlbums() {
		return albumRepository.findAll();
	}

	@Override
	public Optional<Album> getAlbumById(int id) {
		// TODO Auto-generated method stub
		return albumRepository.findById(id);
	}

	@Override
	public Album getAlbumByName(String name) {
		// TODO Auto-generated method stub
		return albumRepository.findAllByName(name);
	}

	@Override
	public void updateAlbum(Album Album) {
		// TODO Auto-generated method stub
		albumRepository.save(Album);
	}

	@Override
	public void deleteAlbum(int id) {
		// TODO Auto-generated method stub
		albumRepository.deleteById(id);
	}

}
