package com.joaolino.searchstation.Model;

import java.util.ArrayList;
import java.util.List;

import com.joaolino.searchstation.DAO.StationDAO;
import com.joaolino.searchstation.DAO.StationDAOImpl;

public class StationModel {
	
	// Data access object 
	StationDAO stations;

	public StationModel(boolean init) {
		stations = new StationDAOImpl();
		
		if(init) {
			stubStations();
		}
	}
	
	/**
	 * Searches for stations where the name start with a given {@Code String}
	 * The object returned lists a.	all stations that start with the 
	 * search {@code String} and b.	all valid next characters for each 
	 * matched station.
	 *
	 * @param  partialName the search {@code String} to search for
	 * @return a StationNameCompleteSuggestion
	 * @since 1.7
	 */
	public StationNameCompleteSuggestion getStationNameCompleteSuggestion(String partialName) {
    	
    	// Search for matching stations
		List<Station> matchingStations = stations.findByName(partialName);
		
		// Transform into a list of station names
		List<String> sugestedStations = new ArrayList<String>();
		for(Station station : matchingStations) {
			sugestedStations.add(station.getName());
		}
		
		// Search matching station names for all possible next characters
		int typedChars = partialName.length();
		List<String> nextCharacters = new ArrayList<String> ();
		for (String station : sugestedStations) {
			if(station.length() > typedChars) {
				String nextChar = new String() + station.charAt(partialName.length());
				if(!nextCharacters.contains(nextChar)) {
					nextCharacters.add(nextChar);
				}
			}
		}
		
    	return new StationNameCompleteSuggestion(sugestedStations, nextCharacters);
    }
	
	private void stubStations() {

    	// Add all train station names provided as an example in the requirements
    	stations.insertStation(new Station("DARTFORD"));
    	stations.insertStation(new Station("DARTMOUTH"));
    	stations.insertStation(new Station("TOWER HILL"));
    	stations.insertStation(new Station("DERBY"));
    	stations.insertStation(new Station("LIVERPOOL"));
    	stations.insertStation(new Station("LIVERPOOL LIME STREET"));
    	stations.insertStation(new Station("PADDINGTON"));
    	stations.insertStation(new Station("EUSTON"));
    	stations.insertStation(new Station("LONDON BRIDGE"));
    	stations.insertStation(new Station("VICTORIA"));
    	
    	// Add UK's Train stations that start with the letter A
    	stations.insertStation(new Station("Abbey Wood"));
    	stations.insertStation(new Station("Aber"));
    	stations.insertStation(new Station("Abercynon"));
    	stations.insertStation(new Station("Aberdare"));
    	stations.insertStation(new Station("Aberdeen"));
    	stations.insertStation(new Station("Aberdour"));
    	stations.insertStation(new Station("Aberdovey"));
    	stations.insertStation(new Station("Abererch"));
    	stations.insertStation(new Station("Abergavenny"));
    	stations.insertStation(new Station("Abergele & Pensarn"));
    	stations.insertStation(new Station("Aberystwyth"));
    	stations.insertStation(new Station("Accrington"));
    	stations.insertStation(new Station("Achanalt"));
    	stations.insertStation(new Station("Achnasheen"));
    	stations.insertStation(new Station("Achnashellach"));
    	stations.insertStation(new Station("Acklington"));
    	stations.insertStation(new Station("Acle"));
    	stations.insertStation(new Station("Acocks Green"));
    	stations.insertStation(new Station("Acton Bridge"));
    	stations.insertStation(new Station("Acton Central"));
    	stations.insertStation(new Station("Acton Main Line"));
    	stations.insertStation(new Station("Adderley Park"));
    	stations.insertStation(new Station("Addiewell"));
    	stations.insertStation(new Station("Addlestone"));
    	stations.insertStation(new Station("Adelaide (Northern Ireland)"));
    	stations.insertStation(new Station("Adisham"));
    	stations.insertStation(new Station("Adlington (Cheshire)"));
    	stations.insertStation(new Station("Adlington (Lancashire)"));
    	stations.insertStation(new Station("Adwick"));
    	stations.insertStation(new Station("Aigburth"));
    	stations.insertStation(new Station("Ainsdale"));
    	stations.insertStation(new Station("Aintree"));
    	stations.insertStation(new Station("Airbles"));
    	stations.insertStation(new Station("Airdrie"));
    	stations.insertStation(new Station("Albany Park"));
    	stations.insertStation(new Station("Albrighton"));
    	stations.insertStation(new Station("Alderley Edge"));
    	stations.insertStation(new Station("Aldermaston"));
    	stations.insertStation(new Station("Aldershot"));
    	stations.insertStation(new Station("Aldrington"));
    	stations.insertStation(new Station("Alexandra Palace"));
    	stations.insertStation(new Station("Alexandra Parade"));
    	stations.insertStation(new Station("Alexandria"));
    	stations.insertStation(new Station("Alfreton"));
    	stations.insertStation(new Station("Alloa"));
    	stations.insertStation(new Station("Allens West"));
    	stations.insertStation(new Station("Alness"));
    	stations.insertStation(new Station("Alnmouth for Alnwick"));
    	stations.insertStation(new Station("Alresford (Essex)"));
    	stations.insertStation(new Station("Alsager"));
    	stations.insertStation(new Station("Althorne"));
    	stations.insertStation(new Station("Althorpe"));
    	stations.insertStation(new Station("Altnabreac"));
    	stations.insertStation(new Station("Alton"));
    	stations.insertStation(new Station("Altrincham"));
    	stations.insertStation(new Station("Alvechurch"));
    	stations.insertStation(new Station("Ambergate"));
    	stations.insertStation(new Station("Amberley"));
    	stations.insertStation(new Station("Amersham"));
    	stations.insertStation(new Station("Ammanford"));
    	stations.insertStation(new Station("Ancaster"));
    	stations.insertStation(new Station("Anderston"));
    	stations.insertStation(new Station("Andover"));
    	stations.insertStation(new Station("Anerley"));
    	stations.insertStation(new Station("Angel Road"));
    	stations.insertStation(new Station("Angmering"));
    	stations.insertStation(new Station("Annan"));
    	stations.insertStation(new Station("Anniesland"));
    	stations.insertStation(new Station("Ansdell & Fairhaven"));
    	stations.insertStation(new Station("Antrim"));
    	stations.insertStation(new Station("Apperley Bridge"));
    	stations.insertStation(new Station("Appleby"));
    	stations.insertStation(new Station("Appledore (Kent)"));
    	stations.insertStation(new Station("Appleford"));
    	stations.insertStation(new Station("Appley Bridge"));
    	stations.insertStation(new Station("Apsley"));
    	stations.insertStation(new Station("Arbroath"));
    	stations.insertStation(new Station("Ardgay"));
    	stations.insertStation(new Station("Ardlui"));
    	stations.insertStation(new Station("Ardrossan Harbour"));
    	stations.insertStation(new Station("Ardrossan South Beach"));
    	stations.insertStation(new Station("Ardrossan Town"));
    	stations.insertStation(new Station("Ardwick"));
    	stations.insertStation(new Station("Argyle Street"));
    	stations.insertStation(new Station("Arisaig"));
    	stations.insertStation(new Station("Arlesey"));
    	stations.insertStation(new Station("Armadale"));
    	stations.insertStation(new Station("Armathwaite"));
    	stations.insertStation(new Station("Arnside"));
    	stations.insertStation(new Station("Arram"));
    	stations.insertStation(new Station("Arrochar &Tarbet"));
    	stations.insertStation(new Station("Arundel"));
    	stations.insertStation(new Station("Ascot"));
    	stations.insertStation(new Station("Ascott-under-Wychwood"));
    	stations.insertStation(new Station("Ash"));
    	stations.insertStation(new Station("Ash Vale"));
    	stations.insertStation(new Station("Ashburys"));
    	stations.insertStation(new Station("Ashchurch for Tewkesbury"));
    	stations.insertStation(new Station("Ashfield"));
    	stations.insertStation(new Station("Ashford (Middlesex)"));
    	stations.insertStation(new Station("Ashford International"));
    	stations.insertStation(new Station("Ashley"));
    	stations.insertStation(new Station("Ashtead"));
    	stations.insertStation(new Station("Ashton-under-Lyne"));
    	stations.insertStation(new Station("Ashurst"));
    	stations.insertStation(new Station("Ashurst New Forest"));
    	stations.insertStation(new Station("Ashwell & Morden"));
    	stations.insertStation(new Station("Askam"));
    	stations.insertStation(new Station("Aslockton"));
    	stations.insertStation(new Station("Aspatria"));
    	stations.insertStation(new Station("Aspley Guise"));
    	stations.insertStation(new Station("Aston"));
    	stations.insertStation(new Station("Atherstone"));
    	stations.insertStation(new Station("Atherton"));
    	stations.insertStation(new Station("Attadale"));
    	stations.insertStation(new Station("Attenborough"));
    	stations.insertStation(new Station("Attleborough"));
    	stations.insertStation(new Station("Auchinleck"));
    	stations.insertStation(new Station("Audley End"));
    	stations.insertStation(new Station("Aughton Park"));
    	stations.insertStation(new Station("Aviemore"));
    	stations.insertStation(new Station("Avoncliff"));
    	stations.insertStation(new Station("Avonmouth"));
    	stations.insertStation(new Station("Axminster"));
    	stations.insertStation(new Station("Aylesbury"));
    	stations.insertStation(new Station("Aylesbury Vale Parkway"));
    	stations.insertStation(new Station("Aylesford"));
    	stations.insertStation(new Station("Aylesham"));
    	stations.insertStation(new Station("Ayr"));
    }
}
