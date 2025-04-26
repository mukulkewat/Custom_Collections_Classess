package com.userdefined.collection;

public class ArrayList1 {
	private Object[] elementData;
	private int elementCount;
	public ArrayList1() {
		this(10);
	}
	public ArrayList1(int capacity) {
		elementData = new Object[capacity];
		elementCount = 0;
	}
	public void add(Object obj) {
		if(size()==capacity()) {
			grow();
		}
		elementData[elementCount] = obj;
		elementCount++;
	}
	public int capacity() {
		return elementData.length;
	}
	public int size() {
		return elementCount;
	}
	private void grow() {
		//Create an new Object array 
		Object[] nextArray = new Object[capacity()*2];
		//copying data oldData into newArray
		for(int i=0;i<elementData.length;i++) {
			nextArray[i] = elementData[i];
		}
		//assigning newArray to oldArray
		elementData = nextArray;
	}
	public String toString() {
		if(size()==0)return "[]";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0;i<size();i++) {
			sb.append(elementData[i]);
			sb.append(", ");
		}
		int lastIndex = sb.lastIndexOf(", ");
		sb.delete(lastIndex, lastIndex+2);
		sb.append("]");
		return sb.toString();
	}
	

}
