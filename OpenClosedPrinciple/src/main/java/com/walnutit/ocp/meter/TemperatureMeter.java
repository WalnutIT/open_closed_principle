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




import java.util.Date;

import com.walnutit.ocp.atmosphereData.AtmosphereData;
import com.walnutit.ocp.atmosphereData.Temperature;

/**
 * @author Daniel Krentzlin
 *
 */
public class TemperatureMeter extends Meter {

	@Override
	public AtmosphereData measure() {
		Temperature temp = new Temperature(10.0, "C", new Date());
		return temp;
	}

}
