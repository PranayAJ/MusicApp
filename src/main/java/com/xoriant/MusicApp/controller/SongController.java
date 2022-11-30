package com.xoriant.MusicApp.controller;

import java.util.List;
import java.util.Optional;

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

import com.xoriant.MusicApp.model.Song;
import com.xoriant.MusicApp.service.SongService;

@RestController
@RequestMapping("/song")
@CrossOrigin
public class SongController{
	
	@Autowired
	private SongService songService;
	
	@PostMapping("/add")
	public void addSong(@RequestBody Song song) {
		songService.addSong(song);
	}
	
	@GetMapping("/all")
	public List<Song> getSongs() {
		return songService.getSongs();
	}
	
	@GetMapping("/{id}")
	public Optional<Song> getSongById(@PathVariable int id) {
		return songService.getSongById(id);
	}
	
	@GetMapping("/{name}")
	public Song getSongByName(@PathVariable String name) {
		return songService.getSongByName(name);
	}
	
	@PutMapping("/update")
	public void updateSong(@RequestBody Song song) {
		songService.updateSong(song);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteSong(@PathVariable int id) {
		songService.deleteSong(id);
	}
}
