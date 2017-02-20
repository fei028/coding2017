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
		System.out.println(list.get(0));
		Assert.assertEquals("ele", list.get(0));
s	}

	@Test
	public void testAddIntObject() {
		fail("Not yet implemented");
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
