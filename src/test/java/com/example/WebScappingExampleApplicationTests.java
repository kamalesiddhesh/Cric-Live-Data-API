package com.example;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.models.Match;
import com.example.services.MatchService;

import java.util.List;


@SpringBootTest
class WebScappingExampleApplicationTests {
	
	@Autowired
	private MatchService testService;
	
	
	
	
//	@Test public void startTest() { 
//		  System.out.println("start testing");
//		  testService.test(); 
//   }
	 
	
	@Test
	public void getLiveMatchTest() {
		List<Match> liveMatches = testService.getLiveMatches();
		
		liveMatches.forEach(match -> {
			
			System.out.println(match.getMatchHeading());
			System.out.println(match.getLiveText());
			System.out.println(match.getTextComplete());
			System.out.println("======================================================================");
			
		});
	}

}
