package com.cooksys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		List<String> al = new ArrayList<>();
		al.add("Hello");
		al.add("Bill");
		al.add("Lenda");
		
//		System.out.println(al.remove(3));
//		System.out.println(al.get(3));
		System.out.println(al);
		
		Box<Object> b = new Box<Object>(6);
		
		System.out.println(b.getValue());
		b.setValue("Goodbye");
		System.out.println(b.getValue());
		
		Box<Integer> boxy = new Box<Integer>(5);
		
		Set<Box> s = new HashSet<>();
		
		s.add(b);
		s.add(boxy);
		
		System.out.println(s);
		System.out.println(s.size());
		
		for (Box box : s) {
			System.out.println(box);
		}
		
		Map<Integer, List<String>> map = new HashMap<>();
		
		map.put(201, al);
		
		System.out.println(map.get(201));
		
		Collections.sort(al);
		
		System.out.println(al);
		
		
	}

}
