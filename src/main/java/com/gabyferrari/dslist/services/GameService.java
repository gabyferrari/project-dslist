package com.gabyferrari.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gabyferrari.dslist.dto.GameDTO;
import com.gabyferrari.dslist.dto.GameMinDTO;
import com.gabyferrari.dslist.entities.Game;
import com.gabyferrari.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = repository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = repository.findById(id).get();
		return new GameDTO(result);
	}
}
