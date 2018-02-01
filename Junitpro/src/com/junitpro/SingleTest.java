package com.junitpro;

import static org.junit.Assert.fail;

import org.junit.Test;

import junit.framework.Assert;

public class SingleTest {

	
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void test_junit() {
		Multi s1 = new Multi(5,4,3);
		Assert.assertEquals(12,s1.sum());
	}
	@Test
	public void test_junit2() {
		Multi s2 = new Multi(1,2,3);
		Assert.assertEquals(6,s2.multiplication());
}
	@Test
	public void test_junit3() {
		Multi s2 = new Multi(20,10,0);
		Assert.assertEquals(3,s2.divide());
}
	
}