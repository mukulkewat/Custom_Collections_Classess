package com.userdefined.collection;

public class ArrayList {
	private Object[] elementData;
	private int elementCount;
	public ArrayList() {
		this(10);
	}
	public ArrayList(int capacity) {
		elementData = new Object[capacity];
		elementCount = 0;
	}
	public void add(Object obj) {
		if(size() == capacity()) {
			grow();
		}
		elementData[elementCount] = obj;
		elementCount++;
	}
	private void grow() {
		//creating new array object with double capacity
		Object[] nextArray = new Object[capacity()*2];
		//Copying data old array to new array
		for(int i=0;i<elementData.length;i++) {
			nextArray[i]=elementData[i];
		}
		//assigning new array reference variable to old array reference variable
		elementData = nextArray;
	}
	public int capacity() {
		return elementData.length;
	}
	public int size() {
		return elementCount;
	}
	public String toString() {
		if(this.size() == 0) {
			return "[]";
		}
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
