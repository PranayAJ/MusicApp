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

import com.xoriant.MusicApp.model.Artist;
import com.xoriant.MusicApp.service.ArtistService;

@RestController
@RequestMapping("/artist")
@CrossOrigin
public class ArtistController {
	
	@Autowired
	private ArtistService ArtistService;
	
	@PostMapping("/add")
	public void addArtist(@RequestBody Artist artist) {
		ArtistService.addArtist(artist);
	}
	
	@GetMapping("/all")
	public List<Artist> getArtists() {
		return ArtistService.getArtists();
	}
	
	@GetMapping("/{id}")
	public void getArtistById(@PathVariable int id) {
		ArtistService.getArtistById(id);
	}
	
	@GetMapping("/{name}")
	public void getArtistByName(@PathVariable String name) {
		ArtistService.getArtistByName(name);
	}
	
	@PutMapping("/update")
	public void updateArtist(@RequestBody Artist artist) {
		ArtistService.updateArtist(artist);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteArtist(@PathVariable int id) {
		ArtistService.deleteArtist(id);
	}
}
