package com.joaolino.searchstation.DAO;

import java.util.ArrayList;
import java.util.List;

import com.joaolino.searchstation.Model.Station;

public class StationDAOImpl implements StationDAO{

	List<Station> stations;
	
	public StationDAOImpl(){
		// Initialize data set
    	stations = new ArrayList<Station>();
	   }
	
	public List<Station> findByName(String name) {
		List<Station> foundStations = new ArrayList<Station>();
    	
    	// Insert stations in the return list if their name starts with the unfinished station name provided
    	for (Station station : stations) {
			if(station.getName().startsWith(name)) {
				foundStations.add(station);
			}
		}
    	
		return foundStations;
	}

	public boolean insertStation(Station station) {
		
		// Return the result of the add operation
		return stations.add(station);
	}
}
