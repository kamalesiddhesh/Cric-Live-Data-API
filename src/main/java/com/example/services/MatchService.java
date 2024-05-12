package com.example.services;



import java.io.IOException;




import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.example.models.Match;

import java.util.List;
import java.util.ArrayList;



@Service
public class MatchService {
	
	public void test() {
		
		String url = "https://www.learncodewithdurgesh.com/";
		
		
		try {
			Document document = Jsoup.connect(url).get();
			System.out.println(document.toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public List<Match> getLiveMatches() {
		
//		String url = "https://www.espncricinfo.com/live-cricket-score/";
		String url = "https://cricbuzz.com/cricket-match/live-scores/";
		
		List<Match> matchList = new ArrayList<>();
		
		try {
			Document document = Jsoup.connect(url).get();
//			System.out.println(document.toString());
			
			Elements liveScoreElements= (Elements) document.select("div.cb-mtch-lst.cb-tms-itm");
			
			for(Element e : liveScoreElements){
				String teamHeading = e.select("h3.cb-lv-scr-mtch-hdr").select("a").text();
				String matchNumberAndVenue = e.select("span").text();
				String battingTeam = e.select("div.cb-hmscg-bat-txt").select("div.cb-hmscg-tm-nm").text();
				String battingScore = e.select("div.cb-hmscg-bat-txt").select("div.cb-hmscg-tm-nm+div").text();
				
				String bowlingTeam = e.select("div.cb-hmscg-bwl-txt").select("div.cb-hmscg-tm-nm").text();
				String bowlingScore = e.select("div.cb-hmscg-bwl-txt").select("div.cb-hmscg-tm-nm+div").text();
				
				String liveText = e.select("div.cb-scr-wll-chvrn.cb-lv-scrs-col").select("div.cb-text-live").text();
				String textComplete = e.select("div.cb-scr-wll-chvrn.cb-lv-scrs-col").select("div.cb-text-complete").text();
				
				com.example.models.Match match = new com.example.models.Match();
				match.setMatchHeading(teamHeading);
				match.setMatchNumberAndVenue(matchNumberAndVenue);
				match.setBattingTeamName(battingTeam);
				match.setBattingTeamScore(battingScore);
				match.setBowlingTeamName(bowlingTeam);
				match.setBowlingTeamScore(bowlingScore);
				match.setLiveText(liveText);
				match.setTextComplete(textComplete);
				
				
				
//				Add this match to List
				
				matchList.add(match);
				
				
				/*
				 * System.out.println(teamHeading); System.out.println(matchNumberAndVenue);
				 * 
				 * System.out.print(battingTeam +" - "); System.out.println(battingScore);
				 * 
				 * System.out.print(bowlingTeam+" - "); System.out.println(bowlingScore);
				 */ 
				
				 
				
		}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return matchList;
	}
	
	public void getPointTable() {
		
	}

}
