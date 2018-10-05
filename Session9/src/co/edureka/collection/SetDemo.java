package co.edureka.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("John");		//0
		list.add("Jennie");
		list.add("Jim");
		list.add("John");
		list.add("Jennie");
		list.add("Jack");
		list.add("Joe");		//n-1
		
		// In List, data is stored on indexes, but in Set data is stored using hashing and elements will have hashCodes
		
		//Set<String> set = new HashSet<String>(); 	// Polymorphic
		//HashSet<String> set = new HashSet<String>();// Direct Object
		
		//Set<String> set = new TreeSet<String>();
		TreeSet<String> set = new TreeSet<String>(); // Sort the data !!
		set.add("John");	// hashCode
		set.add("Jennie");
		set.add("Jim");
		set.add("John");
		set.add("Jennie");
		set.add("Jack");
		set.add("Joe");		// hashCode
		
		System.out.println("==list details==");
		System.out.println(list);
		
		System.out.println();
		
		// data in set is unordered due to hashing
		System.out.println("==set details==");
		System.out.println(set);
		
		System.out.println();
		
		// cant get a single element from set as we dont know hashCodes or we dont have indexes to get the data
		// we will iterate
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String nm = itr.next();
			System.out.println(nm);
		}
		
		System.out.println();
		
		System.out.println("Size of set is: "+set.size());
		System.out.println("Is Jennie in the set? "+set.contains("Jennie"));
		
		//set.clear();
		//set.addAll(anotherSet);
	}

}
