package com.userdefined.map;

public class HashMap1 {
	private Object[] keysArray;
	private Object[] valuesArray;
	private int size;
	public HashMap1() {
		this(10);
	}
	public HashMap1(int capacity) {
		keysArray = new Object[capacity];
		valuesArray = new Object[capacity];
		size = 0;
	}
	public int size() {
		return size;
	}
	public int capacity() {
		return keysArray.length;
	}
	private void grow() {
		//Creating new keyarr and new value arr
		Object[] newKeyArray = new Object[(capacity()*3)/2];
		Object[] newValueArray = new Object[(capacity()*3)/2];
		//copying oldArray to new Array
		for(int i=0;i<size();i++) {
			newKeyArray[i]=keysArray[i];
			newValueArray[i] = valuesArray[i];
		}
		//assigning new arr reference to old arr
		keysArray = newKeyArray;
		valuesArray = newValueArray;
	}
	public void put(Object key, Object value) {
		if(size()==capacity()) {
			grow();
		}
		keysArray[size] = key;
		valuesArray[size] = value;
		size++;
	}
	public String toString() {
		if(size()==0)return "{}";
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for(int i=0;i<size();i++) {	
			sb.append(keysArray[i]+"="+valuesArray[i]);
			sb.append(", ");
		}
		int lastIndex = sb.lastIndexOf(", ");
		sb.delete(lastIndex, lastIndex+2);
		sb.append("}");
		return sb.toString();
	}
}
