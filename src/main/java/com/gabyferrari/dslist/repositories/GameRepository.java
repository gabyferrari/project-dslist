package com.gabyferrari.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabyferrari.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
