package com.coding.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.coding.mybasic.ArrayList;
import com.coding.mybasic.List;

public class TestArrayList {

	private List list;
	@Before
	public void before() {
		list = new ArrayList();
	}
	
	@Test
	public void testAddObject() {
		list.add("ele");
		Assert.assertEquals("ele", list.get(0));
		Assert.assertEquals(1, list.size());
	}

	@Test
	public void testAddIntObject() {
		list.add("we");
		list.add(1, "gga");
		list.add(0, "start");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.size());
		
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	public void testSize() {
		fail("Not yet implemented");
	}

	@After
	public void after(){
		
	}
}
