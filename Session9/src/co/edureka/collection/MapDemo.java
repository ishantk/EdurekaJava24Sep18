package co.edureka.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		//Map<Integer, String> map = new HashMap<Integer, String>();
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "John");
		map.put(453, "Jennie");
		map.put(333, "Jim");
		map.put(201, "Jack");
		map.put(675, "John");
		map.put(111, "Joe");
		map.put(null, "Sia");
		map.put(543, null);
		
		// update operating, updating key 201 to a newer value Mike
		map.put(201, "Mike"); // key is duplicated !!
		
		System.out.println("==map details==");
		System.out.println(map);
		
		String nm = map.get(453);
		System.out.println("name is: "+nm);
		
		System.out.println("Size of Map is: "+map.size());
		System.out.println("Is 101 key in the map?"+map.containsKey(101));
		System.out.println("Is Joe value in the map?"+map.containsValue("Joe"));
		
		// Iteration
		Set<Integer> keys = map.keySet(); // return a set of all the keys
		System.out.println("==keys in map==");
		System.out.println(keys);
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println(key+"\t"+value);
		}
		
		System.out.println();
		
		// In Map, a key value pair is known as an Entry
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println("==entrySet details==");
		System.out.println(entrySet);
		
		Iterator<Entry<Integer, String>> itr1 = entrySet.iterator();
		while(itr1.hasNext()){
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		//map.clear();
		//map.putAll();
		//..
		
		
		System.out.println();
		
		// Thread-Safe Version | Synchronized -> locks on object ? what if object is null ??
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(101, "John");
		table.put(453, "Jennie");
		table.put(333, "Jim");
		table.put(201, "Jack");
		table.put(675, "John");
		table.put(111, "Joe");
		//table.put(null, "Sia"); // null key not allowed in Hashtable
		//table.put(543, null);   // null value not allowed in Hashtable
		
		System.out.println(table);
	}

}
