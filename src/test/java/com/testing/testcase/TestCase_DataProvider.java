package com.testing.testcase;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.testing.assignment.Calculator;
import com.testing.assignment.TestData;

import junit.framework.Assert;

public class TestCase_DataProvider {
//static int n1 = 3;
//static int n2 = 5;
	
	@Test(enabled = true, groups = { "add", "calculator" }, dataProvider = "getData", dataProviderClass = TestData.class)
	public void additionTest(String n1, String n2) {
		Reporter.log("running the method additionTest", true);
		int result = Calculator.add(Integer.parseInt(n1), Integer.parseInt(n2));
		Assert.assertNotNull(result, "result is null");
		Assert.assertEquals(result,  (Integer.parseInt(n1) + Integer.parseInt(n2)));
		System.out.println("Sum is " + result);
		Reporter.log("additionTest is completed", true);
		
	}
	
	@Test(enabled = true, groups = { "subtract", "calculator" }, dataProvider = "getData", dataProviderClass = TestData.class)
	public void subtrationTest(String n1, String n2) {
		Reporter.log("running the method subtractionTest", true);
		int result = Calculator.sub(Integer.parseInt(n1), Integer.parseInt(n2));
		Assert.assertNotNull(result, "result is null");
		Assert.assertEquals(result,  (Integer.parseInt(n1) + Integer.parseInt(n2)));
		System.out.println("Sum is " + result);
		Reporter.log("running the method subtractionTest", true);
	
}
	
	@Test(enabled = true, groups = { "multiply", "calculator" }, dataProvider = "getData", dataProviderClass = TestData.class)
	public void multiplicationTest(String n1, String n2) {
		Reporter.log("running the method multiplicationTest", true);
		int result = Calculator.mul(Integer.parseInt(n1), Integer.parseInt(n2));
		Assert.assertNotNull(result, "result is null");
		Assert.assertEquals(result,  (Integer.parseInt(n1) + Integer.parseInt(n2)));
		System.out.println("Sum is " + result);
		Reporter.log("running the method multiplicationTest", true);
		
	}
	
	@Test(enabled = true, groups = { "divide", "calculator" }, dataProvider = "getData", dataProviderClass = TestData.class)
	public void dividionTest(String n1, String n2) {
		Reporter.log("running the method divisionTest", true);
		int result = Calculator.mul(Integer.parseInt(n1), Integer.parseInt(n1));
		Assert.assertNotNull(result, "result is null");
		Assert.assertEquals(result,  (Integer.parseInt(n1) + Integer.parseInt(n1)));
		Assert.asserNotEquals(result, 0);
		System.out.println("Sum is " + result);
		Reporter.log("running the method multiplicationTest", true);
		
	}
}
