package com.coding.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.coding.mybasic.LinkedList;
import com.coding.mybasic.List;

public class TestLinkedList {

	private List list;
	
	@Before
	public void before(){
		list = new LinkedList();
	}
	
	@Test
	public void testAddObject() {
		list.add(1);
		
		System.out.println(list.get(0));
		assertEquals(1, list.get(0));
		assertEquals(1, list.size());
	}

	@Test
	public void testAddIntObject() {
		list.add(0,1);
		System.out.println(list.get(0));
		assertEquals(1, list.get(0));
		assertEquals(1, list.size());
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemove() {
		list.add(0,1);
		System.out.println(list.get(0));
		assertEquals(1, list.get(0));
		assertEquals(1, list.size());
		list.remove(0);
		System.out.println(list.get(0));
		assertEquals(0, list.size());
	}

	@Test
	public void testSize() {
		fail("Not yet implemented");
	}

}
