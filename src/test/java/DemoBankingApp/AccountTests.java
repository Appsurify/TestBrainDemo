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

import Accounts.*;


class AccountTests {

	static int i=0;
	int waitTime = 1000;
	
	public void addDelay(){
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	@Test
	public void AccountTestDummyOne(){
		addDelay();
		Accounts account = new Accounts();
		String result = account.dummyMethod("test");
		assertEquals("test", result);
	}

	@Test
	public void AccountTestDummyTwo(){
		addDelay();
		Accounts account = new Accounts();
		String result = account.dummyMethodTwo("test");
		assertEquals("test", result);
	}

	@Test
	public void AccountTestDummyThree(){
		addDelay();
		Accounts account = new Accounts();
		String result = account.dummyMethodThree("test");
		assertEquals("test", result);
	}

	@Test
	public void AccountTestDummyFour(){
		addDelay();
		Accounts account = new Accounts();
		String result = account.dummyMethodFour("test");
		assertEquals("test", result);
	}

	@Test
	public void AccountTestDummyFive(){
		addDelay();
		Accounts account = new Accounts();
		String result = account.dummyMethodFive("test");
		assertEquals("test", result);
	}

	@Test
	public void AccountTestDummySix(){
		addDelay();
		Accounts account = new Accounts();
		String result = account.dummyMethodSix("test");
		assertEquals("test", result);
	}

	@Test
	public void AccountTestDummySeven(){
		addDelay();
		Accounts account = new Accounts();
		String result = account.dummyMethodSeven("test");
		assertEquals("test", result);
	}

	@RepeatedTest(value = 36, name = "{displayName}")
	public void AccountTest() {
		addDelay();
	}
}
