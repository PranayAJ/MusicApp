package com.xoriant.MusicApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.xoriant.MusicApp.model.Playlist;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {

	@Query(value="select * from playlist where p_name=:name", nativeQuery = true)
	Playlist findAllByName(String name);

}
