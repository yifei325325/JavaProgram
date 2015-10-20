package com.oct.twth;
import java.util.*;
public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
		
		System.out.println(m.size());
		System.out.println(m.containsKey("one"));
		
		
		if(m.containsKey("two")){
			int i = m.get("two");
			System.out.println(i);
		}else System.out.println("Wrong");
		
		
	}

}
