package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest1 {

	@Test
	public void add() {
		System.out.println("ADD");
		int a = 10, b = 20;
		Assert.assertEquals(30, a+b);
	}
	@Test
	public void sub() {
		System.out.println("SUB");
		int a = 10, b = 20;
		Assert.assertEquals(10, b-a);
	}

}
