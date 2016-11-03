package com.joaolino.searchstation.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.joaolino.searchstation.Model.StationModel;
import com.joaolino.searchstation.Model.StationNameCompleteSuggestion;
import com.joaolino.searchstation.View.StationView;

public class StationController {
	
	private StationModel model;
	private StationView view;

	public StationController(StationModel model, StationView view) {
		this.model = model;
		this.view = view;
		
		view.addStationNameCompleteSuggestionListener(new StationNameCompleteSuggestionListener());
	}

	class StationNameCompleteSuggestionListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			StationNameCompleteSuggestion suggestion = model.getStationNameCompleteSuggestion(view.getStationName());
			view.writeSuggestions(suggestion);
		}
	}
	
	public void run() {
		while(true) {
			view.draw();
        }
	}
}
