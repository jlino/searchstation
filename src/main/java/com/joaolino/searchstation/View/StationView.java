package com.joaolino.searchstation.View;

import java.awt.event.ActionListener;
import java.util.Scanner;

import com.joaolino.searchstation.Model.StationModel;
import com.joaolino.searchstation.Model.StationNameCompleteSuggestion;

public class StationView {

	@SuppressWarnings("unused")
	private StationModel model;
	private Scanner scan;
	
	private ActionListener stationNameCompleteSuggestionListener;
	
	private String stationName;
	
	public StationView(StationModel model) {
		this.model = model;
		this.scan = new Scanner(System.in);
	}
	
	public void draw() {
    	writeRequest();
		setStationName(readCLIInput());
		
		// This triggers the listener manually.
		stationNameCompleteSuggestionListener.actionPerformed(null);
    }
    
    public void writeRequest() {
    	System.out.print("Insert station name > ");
    }
    
    public String readCLIInput() {
    	return scan.nextLine();
    }

	public void writeSuggestions(StationNameCompleteSuggestion suggestion) {
		System.out.println("The sugested stations " + suggestion.getSugestedStations().toString());
		System.out.println("The sugested charecters " + suggestion.getSugestedCharacters().toString());
	}
	
	public void addStationNameCompleteSuggestionListener(ActionListener stationNameCompleteSuggestionListener) {
		
		// In an event based interface this listener should be associated to event generating objects, to be triggered by an action like a button press.
		this.stationNameCompleteSuggestionListener = stationNameCompleteSuggestionListener;
	}

	public String getStationName() {
		return stationName;
	}

	public String setStationName(String stationName) {
		this.stationName = stationName;
		return stationName;
	}
	
	
}
