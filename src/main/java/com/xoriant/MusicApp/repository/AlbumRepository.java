package com.xoriant.MusicApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xoriant.MusicApp.model.Album;

public interface AlbumRepository extends JpaRepository<Album,Integer>{
	@Query(value="select * from album where album_name=:name", nativeQuery=true)
	Album findAllByName(String name);
}
