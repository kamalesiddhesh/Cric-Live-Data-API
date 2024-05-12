package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Match;
import com.example.services.MatchService;

@RestController
@RequestMapping(value = "/match")
public class MatchController {
	
	private MatchService matchService;

	@Autowired
	public MatchController(MatchService matchService) {
		this.matchService = matchService;
	}
	
// get Live matches
	
	@GetMapping("/live")
	public List<Match> getLiveMatches(){
		return matchService.getLiveMatches();
	}
	
	

}
