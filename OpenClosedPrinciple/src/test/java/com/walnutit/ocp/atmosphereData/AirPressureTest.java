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
package com.walnutit.ocp.atmosphereData;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

/**
 * @author Daniel Krentzlin
 *
 */
class AirPressureTest {

	@Test
	final void test() {
		
		// given
		Date date = new Date();
		double expectedValue = 100.0;
		String expectedUnit = "unit";
		Date expectedDate = date;
		String expectedType = "air_pressure";
		
		// when 
		AirPressure airPressure = new AirPressure(100.0, "unit", date);
		// then
		assertEquals(expectedValue, airPressure.getValue());
		assertEquals(expectedUnit, airPressure.getMeasureUnit());
		assertEquals(expectedDate, airPressure.getMeasurementTime());
		assertEquals(expectedType, airPressure.getType());
		
	}

}
