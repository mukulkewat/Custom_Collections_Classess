package com;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Colle {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet();
		for(int i=5;i>0;i--) {
			hs.add(""+i);
		}
		//hs.add(null);
		
		
		TreeSet<String> ts= new TreeSet(hs);
		String lower = ts.higher("0");
		
		System.out.println(lower);
	}

}
