package com.gabyferrari.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabyferrari.dslist.dto.GameMinDTO;
import com.gabyferrari.dslist.entities.Game;
import com.gabyferrari.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = repository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

}
