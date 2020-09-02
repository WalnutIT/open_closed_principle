package com.walnutit.ocp;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.walnutit.ocp.meter.AirPressureMeter;
import com.walnutit.ocp.meter.TemperatureMeter;

/**
 * Copyright 2020 - 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Daniel Krentzlin
 *
 */
class ControllerTest {

	@Test
	final void testAirPressure() {
		
		// given
		boolean result;
		
		// when
		AirPressureMeter meter = new AirPressureMeter();
		Controller controller = new Controller();
		result = controller.saveAtmosphereData(meter.measure());
		
		// then
		
		assertTrue(result);
	}

	
	@Test
	final void testTemperature() {
		
		// given
		boolean result;
		
		// when		
		TemperatureMeter meter = new TemperatureMeter();
		Controller controller = new Controller();
		result = controller.saveAtmosphereData(meter.measure());
		
		// then
		assertTrue(result);
		
	}

}
