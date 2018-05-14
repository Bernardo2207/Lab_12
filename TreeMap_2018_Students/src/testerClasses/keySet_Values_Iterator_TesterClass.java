package testerClasses;

import interfaces.Entry;
import interfaces.Map;
import mapClasses.BSTMap;

public class keySet_Values_Iterator_TesterClass {

	public static void main(String[] args) {
		BSTMap<Integer, String> map = 
			new BSTMap<Integer, String>(new NumberComparator1()); 
		mapInsert(1, "one", map); 
		mapInsert(30, "thirty", map); 
		mapInsert(13, "thirteen", map); 
		mapInsert(40, "forty", map); 
		mapInsert(-10, "minus ten", map); 
		mapInsert(19, "nineteen", map); 
		mapInsert(11, "eleven", map);  
		mapInsert(4, "four", map); 
		mapInsert(-5, "minus five", map); 
		mapInsert(35, "thirty five", map);  
		mapInsert(50, "fifty", map);  

		System.out.println("KEY ITERATOR AND VALUES ITERATOR TESTER");
		//showMap("Original Map", map);  
		
		showMapValues("All map Values", map);
		showMapKeys("All map Keys",map);
		
		showMapEntries("Entries in the map (visiting nodes in inorder)", map); 
	}
	
	private static void mapInsert(int key, String value, BSTMap<Integer, String> map) { 
		//System.out.println("Map after inserting [key = " + key + ", " + " values = " + value + "]"); 
		map.put(key, value); 
		//map.displayTree();
		
	}
	private static <K,V> void showMap(final String msg, final Map<K,V> m) { 
		System.out.println("\n" + msg); 
		BSTMap<K,V> bstm = (BSTMap<K,V>) m; 
		bstm.displayTree(); 
	}
	private static <K,V> void showMapValues(final String msg, final Map<K,V> m) { 
		System.out.println("\n" + msg); 
		for (V value : m.values()) 
			System.out.println(value); 
	}

	private static <K,V> void showMapKeys(final String msg, final Map<K,V> m) { 
		System.out.println("\n" + msg); 
		for (K key : m.keySet()) 
			System.out.println(key); 
	}

	private static <K,V> void showMapEntries(final String msg, final Map<K,V> m) { 
		System.out.println("\n" + msg); 
		for (Entry<K,V> e : m.entrySet()) 
			System.out.println(e); 
	}
}
