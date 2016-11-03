package com.joaolino.searchstation;

import com.joaolino.searchstation.Controller.StationController;
import com.joaolino.searchstation.Model.StationModel;
import com.joaolino.searchstation.View.StationView;

public class App 
{
    public static void main( String[] args )
    {
    	// Build environment
    	StationModel model = new StationModel(true);
    	StationView view = new StationView(model);
    	StationController controller = new StationController(model, view);
        
    	// Startup the environment
        controller.run();
    }
}
