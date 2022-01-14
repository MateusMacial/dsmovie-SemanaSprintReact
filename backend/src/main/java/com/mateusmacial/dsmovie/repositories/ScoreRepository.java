package com.mateusmacial.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mateusmacial.dsmovie.entities.Score;
import com.mateusmacial.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
