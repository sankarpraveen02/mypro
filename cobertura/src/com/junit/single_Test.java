package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class single_Test {

	
	public void test() {
		fail("Not yet implemented");
	}
@Test
public void test_junit() {
	Multi s1 = new Multi(5,4);
	Assert.assertEquals(20,s1.multiplication());
}
@Test
public void test_junit2() {
	Multi s2 = new Multi(20,4);
	Assert.assertEquals(5,s2.divide());
}
}

	


