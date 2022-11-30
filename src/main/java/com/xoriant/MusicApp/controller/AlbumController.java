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

import com.xoriant.MusicApp.model.Album;
import com.xoriant.MusicApp.service.AlbumService;

@RestController
@RequestMapping("/album")
@CrossOrigin
public class AlbumController {
	
	@Autowired
	private AlbumService albumService;
	
	@PostMapping("/add")
	public void addAlbum(@RequestBody Album album) {
		albumService.addAlbum(album);
	}
	
	@GetMapping("/all")
	public List<Album> getAlbums() {
		return albumService.getAlbums();
	}
	
	@GetMapping("/{id}")
	public void getAlbumById(@PathVariable int id) {
		albumService.getAlbumById(id);
	}
	
	@GetMapping("/{name}")
	public void getAlbumByName(@PathVariable String name) {
		albumService.getAlbumByName(name);
	}
	
	@PutMapping("/update")
	public void updateAlbum(@RequestBody Album Album) {
		albumService.updateAlbum(Album);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteAlbum(@PathVariable int id) {
		albumService.deleteAlbum(id);
	}
}
