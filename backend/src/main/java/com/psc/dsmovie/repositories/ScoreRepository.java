package com.psc.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psc.dsmovie.entities.Score;
import com.psc.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
