package com.psc.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psc.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
