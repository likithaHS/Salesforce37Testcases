package Teckarch.Day9;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Question8 {

	public static void main(String[] args) {
	
		HashMap<String,Integer> myMap = new HashMap<>();
	myMap.put("abc",10);
	myMap.put("xyz",90);
	myMap.put("efg",20);
	myMap.put("aft",60);
	myMap.put("hij",80);
	myMap.put("ygf",10);
	TreeMap<String,Integer> sorted = new TreeMap<>();
	sorted.putAll(myMap);
	
	for(Entry<String, Integer> entry: sorted.entrySet()) {
	System.out.println("key="+entry.getKey()+",value="+entry.getValue());

	}
	}

}
