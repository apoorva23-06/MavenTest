package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest2 {

	@Test
	public void div() {
		System.out.println("DIV");
		int a = 10, b = 20;
		Assert.assertEquals(2, b/a);
	}
	@Test
	public void mul() {
		System.out.println("MUL");
		int a = 10, b = 20;
		Assert.assertEquals(200, a*b);
	}
}
