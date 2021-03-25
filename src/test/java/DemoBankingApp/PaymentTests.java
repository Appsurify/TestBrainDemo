/* Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package DemoBankingApp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.fail;

import static org.junit.Assert.*;
import Payments.*;


class PaymentsTests {

	static int i=0;
	int waitTime = 1200;
	
	public void addDelay(){
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	@Test
	public void PaymentsTestDummyOne(){
		addDelay();
		Payments testInstance = new Payments();
		String result = testInstance.dummyMethod("test");
		assertEquals("test", result);
	}

	@Test
	public void PaymentsTestDummyTwo(){
		addDelay();
		Payments testInstance = new Payments();
		String result = testInstance.dummyMethodTwo("test");
		assertEquals("test", result);
	}

	@Test
	public void PaymentsTestDummyThree(){
		addDelay();
		Payments testInstance = new Payments();
		String result = testInstance.dummyMethodThree("test");
		assertEquals("test", result);
	}

	@Test
	public void PaymentsTestDummyFour(){
		addDelay();
		Payments testInstance = new Payments();
		String result = testInstance.dummyMethodFour("test");
		assertEquals("test", result);
	}

	@Test
	public void PaymentsTestDummyFive(){
		addDelay();
		Payments testInstance = new Payments();
		String result = testInstance.dummyMethodFive("test");
		assertEquals("test", result);
	}

	@Test
	public void PaymentsTestDummySix(){
		addDelay();
		Payments testInstance = new Payments();
		String result = testInstance.dummyMethodSix("test");
		assertEquals("test", result);
	}

	@Test
	public void PaymentsTestDummySeven(){
		addDelay();
		Payments testInstance = new Payments();
		String result = testInstance.dummyMethodSeven("test");
		assertEquals("test", result);
	}

}
