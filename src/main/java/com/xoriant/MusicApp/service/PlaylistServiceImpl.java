package com.xoriant.MusicApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.MusicApp.model.Playlist;
import com.xoriant.MusicApp.repository.PlaylistRepository;

@Service
public class PlaylistServiceImpl implements PlaylistService {
	@Autowired
	private PlaylistRepository playlistRepository;
	
	@Override
	public void addPlaylist(Playlist Playlist) {
		// TODO Auto-generated method stub
		playlistRepository.save(Playlist);
	}

	@Override
	public List<Playlist> getPlaylists() {
		return playlistRepository.findAll();
	}

	@Override
	public Optional<Playlist> getPlaylistById(int id) {
		// TODO Auto-generated method stub
		return playlistRepository.findById(id);
	}

	@Override
	public Playlist getPlaylistByName(String name) {
		// TODO Auto-generated method stub
		return playlistRepository.findAllByName(name);
	}

	@Override
	public void updatePlaylist(Playlist Playlist) {
		// TODO Auto-generated method stub
		playlistRepository.save(Playlist);
	}

	@Override
	public void deletePlaylist(int id) {
		// TODO Auto-generated method stub
		playlistRepository.deleteById(id);
	}
}
