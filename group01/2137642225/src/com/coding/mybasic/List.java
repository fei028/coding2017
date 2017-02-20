package com.coding.mybasic;

public interface List {
	public void add(Object element);
	public void add(int index, Object element) throws Exception;
	public Object get(int index);
	public Object remove(int index);
	public int size();
}
