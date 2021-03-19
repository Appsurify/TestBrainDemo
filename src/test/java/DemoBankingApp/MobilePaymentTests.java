/*
 * Copyright 2015-2018 the original author or authors.
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
import Payments.OnlinePayments.MobilePayments.*;


class MobilePaymentsTests {

	static int i=0;
	int waitTime = 2500;
	
	public void addDelay(){
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@RepeatedTest(value = 15, name = "{displayName}")
	public void MobilePaymentsTest() {
		addDelay();
	}


	@Test
	public void MobilePaymentsTestDummyOne(){
		addDelay();
		MobilePayments testInstance = new MobilePayments();
		String result = testInstance.dummyMethod("test");
		assertEquals("test", result);
	}

	@Test
	public void MobilePaymentsTestDummyTwo(){
		addDelay();
		MobilePayments testInstance = new MobilePayments();
		String result = testInstance.dummyMethodTwo("test");
		assertEquals("test", result);
	}

	@Test
	public void MobilePaymentsTestDummyThree(){
		addDelay();
		MobilePayments testInstance = new MobilePayments();
		String result = testInstance.dummyMethodThree("test");
		assertEquals("test", result);
	}

	@Test
	public void MobilePaymentsTestDummyFour(){
		addDelay();
		MobilePayments testInstance = new MobilePayments();
		String result = testInstance.dummyMethodFour("test");
		assertEquals("test", result);
	}

	@Test
	public void MobilePaymentsTestDummyFive(){
		addDelay();
		MobilePayments testInstance = new MobilePayments();
		String result = testInstance.dummyMethodFive("test");
		assertEquals("test", result);
	}

	@Test
	public void MobilePaymentsTestDummySix(){
		addDelay();
		MobilePayments testInstance = new MobilePayments();
		String result = testInstance.dummyMethodSix("test");
		assertEquals("test", result);
	}

	@Test
	public void MobilePaymentsTestDummySeven(){
		addDelay();
		MobilePayments testInstance = new MobilePayments();
		String result = testInstance.dummyMethodSeven("test");
		assertEquals("test", result);
	}

}
