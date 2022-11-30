package com.xoriant.MusicApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.MusicApp.model.Song;
import com.xoriant.MusicApp.repository.SongRepository;

@Service
public class SongServiceImpl implements SongService{

	@Autowired
	private SongRepository songRepository;
	
	@Override
	public void addSong(Song song) {
		// TODO Auto-generated method stub
		songRepository.save(song);
	}

	@Override
	public List<Song> getSongs() {
		return songRepository.findAll();
	}

	@Override
	public Optional<Song> getSongById(int id) {
		// TODO Auto-generated method stub
		return songRepository.findById(id);
	}

	@Override
	public Song getSongByName(String name) {
		// TODO Auto-generated method stub
		return songRepository.findAllByName(name);
	}

	@Override
	public void updateSong(Song song) {
		// TODO Auto-generated method stub
		songRepository.save(song);
	}

	@Override
	public void deleteSong(int id) {
		// TODO Auto-generated method stub
		songRepository.deleteById(id);
	}

}
