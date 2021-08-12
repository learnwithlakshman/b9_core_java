package com.careerit.cj.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

		public static void main(String[] args) {
			
					Map<Integer,String> map = new HashMap<>();
					
					map.put(1001, "Krish");
					map.put(1002, "Manoj");
					map.put(1003, "Nareen");
					map.put(1001, "Jayesh");
					map.put(1004, "Rohit");
					map.put(1002, "Kiran");
					
					System.out.println(map.get(1002));
					
					map.putIfAbsent(1005, "John");
					
					System.out.println(map);
					
					Set<Integer> keys = map.keySet();
					
					for(Integer key :keys) {
						System.out.println(key+" "+map.get(key));
					}
					
					Collection<String> values = map.values();
					for(String value:values) {
						System.out.println(value);
					}
					
					Set<Entry<Integer, String>> entrySet = map.entrySet();
					for(Entry<Integer, String> entry:entrySet) {
						System.out.println(entry.getKey()+" "+entry.getValue());
					}
					
					map.entrySet().forEach(ele->{
						System.out.println(ele.getKey()+" "+ele.getValue());
					});
		}
}
