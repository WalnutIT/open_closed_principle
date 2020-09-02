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
package com.walnutit.ocp.meter;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.walnutit.ocp.atmosphereData.AirPressure;

/**
 * @author Daniel Krentzlin
 *
 */
class AirPressureMeterTest {

	@Test
	final void test() {
		// given
		double expectedValue = 1050.0;
		String expectedUnit = "hP";
		String datePattern = "yyyy-MM-dd HH:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
		String expectedDate = sdf.format(new Date());
		String expectedType = "air_pressure";
		// when
		AirPressureMeter meter = new AirPressureMeter();
		AirPressure airPressure = (AirPressure) meter.measure();
		
		
		
		// then
		assertEquals(expectedValue, airPressure.getValue());
		assertEquals(expectedUnit, airPressure.getMeasureUnit());
		assertEquals(expectedDate, sdf.format(airPressure.getMeasurementTime()));
		assertEquals(expectedType, airPressure.getType());
		
	}

}
