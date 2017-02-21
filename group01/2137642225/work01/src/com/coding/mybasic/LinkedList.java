package com.coding.mybasic;

public class LinkedList implements List {
	
	private Node head;
	private Node last;
	private int size;
	
	
	@Override
	public void add(Object element) {
		if(head == null){
			head = new Node();
			head.data = element;
			head.next = null;
			last = head;
			return;
		}
		Node node = new Node();
		node.data =element;
		node.next = null;
		last.next = node;
		last = node;
		size++;
	}
	@Override
	public void add(int index, Object element) {
		
		
	}
	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void addFirst(Object o){
		
	}
	public void addLast(Object o){
		
	}
	public Object removeFirst(){
		return null;
	}
	public Object removeLast(){
		return null;
	}
//	public Iterator iterator(){
//		return null;
//	}
	/**
	 * 检查index index >=0 且  < size
	 * @param index 
	 * @throws Exception
	 */
	private void checkIndex(int index) {
		if(index < 0){
			throw new RuntimeException("index 必须大于0");
		}
		// 越界
		if(index >= size){
			throw new RuntimeException("index 必须小于size:" + size);
		}
	}
	
	
	/**
	 * 后移元素，从index开始
	 * @param index
	 */
	private void moveBackwardElement(int index) {
	}
	/**
	 * 前移元素,从index开始
	 * @param index
	 */
	private void moveForwardElement(int index) {
	}
	
	private static class Node{
		Object data;
		Node next;
		public Node() {
		}
		@SuppressWarnings("unused")
		public Node(Object data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
		
		
	}
}
