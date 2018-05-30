package com.testngSample;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.methods.methods;

public class SampleDependsTests {
	
	methods m;
	
	@BeforeSuite
	public void Testsuite() {
		m=new methods();
	
		System.out.println("Befor @@@@@@@@");
		
	}

	@Test(dependsOnMethods = { "test2" })
	public void test1() {
		
		m.m1();	
		
	}
	
	
	@Test
	public void test2() {
		
		m.m2();	
		
	}

	
	@Test(dependsOnMethods = { "test2" })
	public void test3() {
		
		m.m3();	
		
	}
	
	
	
	@AfterSuite
	public void After() {
		m=new methods();
	
		System.out.println("After @@@@@@@@");
		
	}
	
	
}

  
  


