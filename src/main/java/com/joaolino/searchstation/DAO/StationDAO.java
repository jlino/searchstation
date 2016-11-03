package com.joaolino.searchstation.DAO;

import java.util.List;

import com.joaolino.searchstation.Model.Station;

public interface StationDAO {
	List<Station> findByName(String name);
	boolean insertStation(Station station);
	
}
