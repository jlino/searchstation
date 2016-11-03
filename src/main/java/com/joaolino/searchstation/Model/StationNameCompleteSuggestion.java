package com.joaolino.searchstation.Model;

import java.util.List;

public class StationNameCompleteSuggestion {
	private List<String> sugestedStations;
	private List<String> sugestedCharacters;	
	
	public StationNameCompleteSuggestion(List<String> sugestedStations, List<String> sugestedCharacters) {
		super();
		this.sugestedStations = sugestedStations;
		this.sugestedCharacters = sugestedCharacters;
	}
	
	public List<String> getSugestedStations() {
		return sugestedStations;
	}
	public void setSugestedStations(List<String> sugestedStations) {
		this.sugestedStations = sugestedStations;
	}
	public List<String> getSugestedCharacters() {
		return sugestedCharacters;
	}
	public void setSugestedCharacters(List<String> sugestedCharacters) {
		this.sugestedCharacters = sugestedCharacters;
	}
	
	
}
