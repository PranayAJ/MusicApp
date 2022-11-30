package com.xoriant.MusicApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.MusicApp.model.Playlist;
import com.xoriant.MusicApp.service.PlaylistService;

@RestController
@RequestMapping("/playlist")
@CrossOrigin
public class PlaylistController {
	
	@Autowired
	private PlaylistService playlistService;
	
	@PostMapping("/add")
	public void addPlaylist(@RequestBody Playlist playlist) {
		playlistService.addPlaylist(playlist);
	}
	
	@GetMapping("/all")
	public List<Playlist> getPlaylists() {
		return playlistService.getPlaylists();
	}
	
	@GetMapping("/{id}")
	public void getPlaylistById(@PathVariable int id) {
		playlistService.getPlaylistById(id);
	}
	
	@GetMapping("/{name}")
	public void getPlaylistByName(@PathVariable String name) {
		playlistService.getPlaylistByName(name);
	}
	
	@PutMapping("/update")
	public void updatePlaylist(@RequestBody Playlist playlist) {
		playlistService.updatePlaylist(playlist);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletePlaylist(@PathVariable int id) {
		playlistService.deletePlaylist(id);
	}
}
