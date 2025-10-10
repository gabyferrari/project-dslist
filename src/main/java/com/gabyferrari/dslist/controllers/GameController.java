package com.gabyferrari.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabyferrari.dslist.dto.GameDTO;
import com.gabyferrari.dslist.dto.GameMinDTO;
import com.gabyferrari.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService service;
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = service.findAll();
		return result;
	}

	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO result = service.findById(id);
		return result;
	}
}
