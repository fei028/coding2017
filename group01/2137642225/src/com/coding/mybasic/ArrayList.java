package com.coding.mybasic;

public class ArrayList implements List{
	
	private static final int DEF_CAPACITY = 10;
	private int size;
	private Object[] elementData;

	public ArrayList(){
		elementData = new Object[DEF_CAPACITY];
	}
	
	public ArrayList(int initCapacity) throws Exception{
		if(initCapacity <= 0){
			throw new Exception("初始化长度必须大于0");
		}
		elementData = new Object[initCapacity];
	}

	@Override
	public void add(Object element) {
		checkArrayOutOfRange();
		elementData[size++] = element;
	}


	@Override
	public void add(int index, Object element) {
		// index 在 0到size 之间,index之后元素要后移
		checkIndex(index);
		checkArrayOutOfRange();
		
	}

	/**
	 * 检查数组容量是否已满，已满则扩容
	 */
	private void checkArrayOutOfRange() {
		if(size >= elementData.length){
			// 扩容 默认新容量是原来容量的2倍
			grow(elementData.length * 2);
		}
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
	
	/**
	 * 数组增长
	 * @param newCapacity 新数组容量
	 */ 
	private void grow(int newCapacity) {
		Object[] dest = new Object[newCapacity];
		System.arraycopy(elementData, 0, dest , 0, newCapacity);
		elementData = dest;
	}
	
	/**
	 * 检插入值位置的序号
	 * @param index 
	 * @throws Exception
	 */
	private void checkIndex(int index) {
		if(index < 0){
			throw new RuntimeException("index 必须大于0");
		}
		// 越界
		if(index > size){
			throw new RuntimeException("index 必须小于等于size:" + size);
		}
	}
}
