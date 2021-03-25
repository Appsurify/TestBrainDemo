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

import CreditCards.CreditCard;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class CreditCardTests {

	static int i=0;
	int waitTime = 1300;
	
	public void addDelay(){
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}



	@Test
	public void CreditCardTestDummyOne(){
		addDelay();
		CreditCard testInstance = new CreditCard();
		String result = testInstance.dummyMethod("test");
		assertEquals("test", result);
	}

	@Test
	public void CreditCardTestDummyTwo(){
		addDelay();
		CreditCard testInstance = new CreditCard();
		String result = testInstance.dummyMethodTwo("test");
		assertEquals("test", result);
	}

	@Test
	public void CreditCardTestDummyThree(){
		addDelay();
		CreditCard testInstance = new CreditCard();
		String result = testInstance.dummyMethodThree("test");
		assertEquals("test", result);
	}

	@Test
	public void CreditCardTestDummyFour(){
		addDelay();
		CreditCard testInstance = new CreditCard();
		String result = testInstance.dummyMethodFour("test");
		assertEquals("test", result);
	}

	@Test
	public void CreditCardTestDummyFive(){
		addDelay();
		CreditCard testInstance = new CreditCard();
		String result = testInstance.dummyMethodFive("test");
		assertEquals("test", result);
	}

	@Test
	public void CreditCardTestDummySix(){
		addDelay();
		CreditCard testInstance = new CreditCard();
		String result = testInstance.dummyMethodSix("test");
		assertEquals("test", result);
	}

	@Test
	public void CreditCardTestDummySeven(){
		addDelay();
		CreditCard testInstance = new CreditCard();
		String result = testInstance.dummyMethodSeven("test");
		assertEquals("test", result);
	}

}


