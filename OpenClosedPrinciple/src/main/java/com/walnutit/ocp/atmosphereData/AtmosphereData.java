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

import java.util.Date;

/**
 * @author Daniel Krentzlin
 *
 */
public class AtmosphereData {
	
	private double value;
	private String measureUnit;
	private String type;
	private Date measurementTime;
	
	
	
	
	public AtmosphereData(double value, String measureUnit, Date measurementTime, String type ) {
		super();
		this.value = value;
		this.measureUnit = measureUnit;
		this.measurementTime = measurementTime;
		this.type = type;	
	}
	public double getValue() {
		return value;
	}
	public String getMeasureUnit() {
		return measureUnit;
	}
	public String getType() {
		return type;
	}
	public Date getMeasurementTime() {
		return measurementTime;
	}

}
