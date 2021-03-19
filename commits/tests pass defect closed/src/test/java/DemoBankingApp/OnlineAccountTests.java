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

class OnlineAccountTests {

	static int i=0;

	@Test
	public void OnlineAccountTest1() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//fail("Phone turned off");
	}

	@Test
	public void OnlineAccountTest2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}

	@Test
	public void OnlineAccountTest3() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}

	@RepeatedTest(value = 2, name = "{displayName}")
	public void OnlineAccountTest4() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(i==0){
			i++;
			//fail("Phone turned off");
		}
	}

	@Test
	public void OnlineAccountTest5() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}

	@Test
	public void OnlineAccountTest6() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}

	@Test
	public void OnlineAccountTest7() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}

	@Test
	public void OnlineAccountTest8() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}
	@Test
	public void OnlineAccountTest9() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}
	@Test
	public void OnlineAccountTest11() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}
	@Test
	public void OnlineAccountTest12() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}
	@Test
	public void OnlineAccountTest13() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}
	@Test
	public void OnlineAccountTest14() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}
	@Test
	public void OnlineAccountTest15() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}
	@Test
	public void OnlineAccountTest16() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}
	@Test
	public void OnlineAccountTest17() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}
	@Test
	public void OnlineAccountTest18() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}
	@Test
	public void OnlineAccountTest19() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}
	@Test
	public void OnlineAccountTest20() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}
	@Test
	public void OnlineAccountTest21() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}
	@Test
	public void OnlineAccountTest22() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//fail("Real Defect");
	}
}
