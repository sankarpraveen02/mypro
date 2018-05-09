package com.ze.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ze.main.Arith;

import junit.framework.Assert;

public class SingleTest {

	
	public void test() {
		fail("Not yet implemented");
	}
	

		@Test
		public void test_junit() {
        Arith s1 = new Arith(5,4,3);
			Assert.assertEquals(12,s1.sum());
		}
		@Test
		public void test_junit2() {
			Arith s2 = new Arith(1,2,3);
			Assert.assertEquals(6,s2.multiplication());
	}
		@Test
		public void test_junit3() {
			Arith s2 = new Arith(20,10,0);
			Assert.assertEquals(3,s2.divide());
	}
		
	}

