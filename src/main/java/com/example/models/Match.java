package com.example.models;


public class Match {
	
	private String matchHeading;
	private String matchNumberAndVenue;
	private String battingTeamName;
	private String battingTeamScore;
	private String bowlingTeamName;
	private String bowlingTeamScore;
	private String liveText;
	private String textComplete;
	
	public Match() {
		
	}
	
	
	

	public Match(String matchHeading, String matchNumberAndVenue, String battingTeamName, String battingTeamScore,
			String bowlingTeamName, String bowlingTeamScore, String liveText, String textComplete) {
		super();
		this.matchHeading = matchHeading;
		this.matchNumberAndVenue = matchNumberAndVenue;
		this.battingTeamName = battingTeamName;
		this.battingTeamScore = battingTeamScore;
		this.bowlingTeamName = bowlingTeamName;
		this.bowlingTeamScore = bowlingTeamScore;
		this.liveText = liveText;
		this.textComplete = textComplete;
	}




	public String getMatchHeading() {
		return matchHeading;
	}

	public void setMatchHeading(String matchHeading) {
		this.matchHeading = matchHeading;
	}

	public String getMatchNumberAndVenue() {
		return matchNumberAndVenue;
	}

	public void setMatchNumberAndVenue(String matchNumberAndVenue) {
		this.matchNumberAndVenue = matchNumberAndVenue;
	}

	public String getBattingTeamName() {
		return battingTeamName;
	}

	public void setBattingTeamName(String battingTeamName) {
		this.battingTeamName = battingTeamName;
	}

	public String getBattingTeamScore() {
		return battingTeamScore;
	}

	public void setBattingTeamScore(String battingTeamScore) {
		this.battingTeamScore = battingTeamScore;
	}

	public String getBowlingTeamName() {
		return bowlingTeamName;
	}

	public void setBowlingTeamName(String bowlingTeamName) {
		this.bowlingTeamName = bowlingTeamName;
	}

	public String getBowlingTeamScore() {
		return bowlingTeamScore;
	}

	public void setBowlingTeamScore(String bowlingTeamScore) {
		this.bowlingTeamScore = bowlingTeamScore;
	}
	
	public String getLiveText() {
		return liveText;
	}

	public void setLiveText(String liveText) {
		this.liveText = liveText;
	}
	
	public String getTextComplete() {
		return textComplete;
	}

	public void setTextComplete(String textComplete) {
		this.textComplete = textComplete;
	}




	@Override
	public String toString() {
		return "Match [matchHeading=" + matchHeading + ", matchNumberAndVenue=" + matchNumberAndVenue
				+ ", battingTeamName=" + battingTeamName + ", battingTeamScore=" + battingTeamScore
				+ ", bowlingTeamName=" + bowlingTeamName + ", bowlingTeamScore=" + bowlingTeamScore + ", liveText="
				+ liveText + ", textComplete=" + textComplete + "]";
	}


	
	
	
	
	
	
	
	
	
}
