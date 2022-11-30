package com.xoriant.MusicApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xoriant.MusicApp.model.Artist;

public interface ArtistRepository extends JpaRepository<Artist,Integer> {

	@Query(value="select * from artist where artist_name=:name", nativeQuery=true)
	Artist findAllByName(String name);
	
}
