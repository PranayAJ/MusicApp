package com.xoriant.MusicApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.xoriant.MusicApp.model.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer>{

	@Query(value="select * from song where song_name=:name", nativeQuery = true)
	Song findAllByName(@Param(value="name") String name);
	
	
}
