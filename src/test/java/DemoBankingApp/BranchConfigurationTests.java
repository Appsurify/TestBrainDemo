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
import BranchConfiguration.*;


class BranchConfigurationTests {

	static int i=0;
	int waitTime = 1750;
	
	public void addDelay(){
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@RepeatedTest(value = 37, name = "{displayName}")
	public void BranchConfigurationTest() {
		addDelay();
	}


	@Test
	public void BranchConfigurationTestDummyOne(){
		addDelay();
		BranchConfiguration testInstance = new BranchConfiguration();
		String result = testInstance.dummyMethod("test");
		assertEquals("test", result);
	}

	@Test
	public void BranchConfigurationTestDummyTwo(){
		addDelay();
		BranchConfiguration testInstance = new BranchConfiguration();
		String result = testInstance.dummyMethodTwo("test");
		assertEquals("test", result);
	}

	@Test
	public void BranchConfigurationTestDummyThree(){
		addDelay();
		BranchConfiguration testInstance = new BranchConfiguration();
		String result = testInstance.dummyMethodThree("test");
		assertEquals("test", result);
	}

	@Test
	public void BranchConfigurationTestDummyFour(){
		addDelay();
		BranchConfiguration testInstance = new BranchConfiguration();
		String result = testInstance.dummyMethodFour("test");
		assertEquals("test", result);
	}

	@Test
	public void BranchConfigurationTestDummyFive(){
		addDelay();
		BranchConfiguration testInstance = new BranchConfiguration();
		String result = testInstance.dummyMethodFive("test");
		assertEquals("test", result);
	}

	@Test
	public void BranchConfigurationTestDummySix(){
		addDelay();
		BranchConfiguration testInstance = new BranchConfiguration();
		String result = testInstance.dummyMethodSix("test");
		assertEquals("test", result);
	}

	@Test
	public void BranchConfigurationTestDummySeven(){
		addDelay();
		BranchConfiguration testInstance = new BranchConfiguration();
		String result = testInstance.dummyMethodSeven("test");
		assertEquals("test", result);
	}

}

