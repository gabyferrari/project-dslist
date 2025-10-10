package com.gabyferrari.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabyferrari.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
