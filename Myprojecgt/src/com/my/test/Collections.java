package com.my.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Collections {
		static List<String> list=new ArrayList<String>();
		static Set<String> set=new HashSet<String>();
		public static void main(String[] args) {
			list.add("ramesh");
			list.add("Shyam");
			list.add("meenu");
			System.out.println(list.get(0));
			Iterator iterator=list.iterator();
			while(iterator.hasNext()) {
		       System.out.println(iterator.next());
			}
			for(String s:list) {
				System.out.println(s);
			}
			System.out.println( set.add("ramesh"));
			System.out.println( set.add("ramesh"));
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
			
			List<String> myList=new ArrayList<String>(set);
			for(String s:myList) {
				System.out.println(s);
			}
			
			String i[]=new String[list.size()];
			i=list.toArray(i);
			
			System.out.println(i[2]);
			
			
		}
		
}
