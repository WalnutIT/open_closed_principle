package com.walnutit.ocp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.walnutit.ocp.meter.AirPressureMeter;
import com.walnutit.ocp.meter.TemperatureMeter;

@SpringBootApplication
public class OpenClosedPrincipleApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(OpenClosedPrincipleApplication.class, args);
		
				
		Controller controller = new Controller();
		AirPressureMeter airPressureMeter = new AirPressureMeter();
		TemperatureMeter temperatureMeter = new TemperatureMeter();
		
		controller.saveAtmosphereData(airPressureMeter.measure());
		controller.saveAtmosphereData(temperatureMeter.measure());
		
	}

}
