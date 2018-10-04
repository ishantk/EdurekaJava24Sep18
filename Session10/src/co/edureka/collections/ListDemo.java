package co.edureka.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/*
How List and ArrayList are related to each other internally
interface List{
	
}

class ArrayList implements List{
	
}
 */

class Student{
	
	int roll;
	String name;
	
	Student(){
		
	}
	
	Student(int roll, String name){
		this.roll = roll;
		this.name = name;
	}
	
	public String toString() {
		return roll+" - "+name;
	}
}

public class ListDemo {

	public static void main(String[] args) {
		
		// Direct Object Construction
		
		// No Type Specifications : we can store any type of data in list1
		ArrayList list1 = new ArrayList(); // Can Store any type
		
		// Type Specification : Generics in Java ->  <>
		ArrayList<String> list2 = new ArrayList<String>(); // Can only store Strings 
		ArrayList<Student> list3 = new ArrayList<Student>(); // Can only store Student Objects 

		// Polymorphic Statement
		List<String> list4 = new ArrayList<String>();
		
		Student s1 = new Student(1,"John");
		Student s2 = new Student(2,"Fionna");
		Student s3 = new Student(3,"Sia");
		
		// 1. Insert or Add the data in the list
		list1.add("Jennie"); 	//0
		list1.add(10);  // -> list1.add(new Integer(10)); // Auto-Boxing shall happen
		list1.add(s1);
		list1.add(2.2); //-> list1.add(new Double(10)); // Auto-Boxing shall happen
		list1.add("Harry");		//4 -> n-1, where n is the size i.e. 5
		
		//list2.add(0,"John");	//0 -> You can mention indexes if you want but its managed automatically
		list2.add("John");		//0
		list2.add("Jennie");	//1
		list2.add("Jim");		//.
		list2.add("John");
		list2.add("Jack");
		list2.add("Jennie");
		list2.add("Joe");		//n-1, where n is the size
		//list2.add(10); // err
		//list2.add(s1); // err
		
		list3.add(s1);		//0
		list3.add(s2);
		list3.add(s3);
		list3.add(s2);		//n-1
		//list3.add(10);		// err
		//list3.add("John");	// err
		
		//2. Read All Elements of List
		System.out.println("==list1 Contents==");
		System.out.println(list1);
		System.out.println();
		
		System.out.println("==list2 Contents==");
		System.out.println(list2);
		System.out.println();
		
		System.out.println("==list3 Contents==");
		System.out.println(list3);
		System.out.println();
		
		// Lists - Supports Redundancy or Duplicacy
		
		//3. Size of the List
		System.out.println("list1 size is: "+list1.size());
		System.out.println("list2 size is: "+list2.size());
		System.out.println("list3 size is: "+list3.size());
		
		//4. Read a single element from list
		Object o = list1.get(3);
		String str = list2.get(3);
		Student s = list3.get(1);
		
		System.out.println(o);
		System.out.println(str);
		System.out.println(s);
		
		System.out.println();
		
		// 5. Update contents in the list
		System.out.println("Before Updation:"+list2);
		list2.set(3, "Mike"); // updated 0th index contents
		System.out.println("After Updation:"+list2);
		
		System.out.println();
		
		//6. Remove the Contents from the list
		System.out.println("Before Deletion:"+list2);
		list2.remove(3);
		System.out.println("After Deletion:"+list2);
		
		//7. Remove All
		//list2.clear();
		//System.out.println("After Clear:"+list2);
		
		//8. indexof
		int idx = list2.indexOf("Jennie");
		idx = list2.lastIndexOf("Jennie");
		System.out.println("idx of Jennie is: "+idx);
		
		//9. contains
		if(list2.contains("Jennie")){
			System.out.println("Jennie is in the list");
		}
		
		// 10. add all the elements for list2 into list5
		ArrayList<String> list5 = new ArrayList<String>();
		list5.add("Bob");
		list5.add("Ben");
		list5.add("Beckie");
		
		list5.addAll(list2);
		System.out.println(list5);
		System.out.println("list5 size "+list5.size());
		
		// Iterating in the List !!
		// 1. For Loop : we have index in the form of i value
		System.out.println("===For Loop===");
		for(int i=0;i<list1.size();i++){
			Object obj = list1.get(i);
			System.out.println(obj);
		}
		System.out.println();
		for(int i=0;i<list2.size();i++){
			String nm = list2.get(i);
			System.out.println(nm);
		}
		System.out.println();
		for(int i=0;i<list3.size();i++){
			Student stu = list3.get(i);
			System.out.println(stu);
		}
		System.out.println();
		
		// 2. Enhanced For Loop : No index is coming here, we are directly reading the elements
		System.out.println("===Enchanced For Loop===");
		for(Object obj : list1){
			System.out.println(obj);
		}
		System.out.println();
		
		for(String nm : list2){
			System.out.println(nm);
		}
		System.out.println();
		
		for(Student stu : list3){
			System.out.println(stu);
		}
		System.out.println();
		
		//3. Iterator API
		System.out.println("===Iterator===");
		Iterator itr1 = list1.iterator();
		Iterator<String> itr2 = list2.iterator();
		Iterator<Student> itr3 = list3.iterator();
		
		/*System.out.println(itr1.next());
		System.out.println(itr1.next());
		
		System.out.println();
		
		System.out.println(itr2.next());
		System.out.println(itr2.next());
		System.out.println(itr2.next());*/
		
		while(itr1.hasNext()){
			Object obj = itr1.next();
			System.out.println(obj);
		}
		
		System.out.println();
		
		while(itr2.hasNext()){
			String nm = itr2.next();
			System.out.println(nm);
			
			if(nm.equals("Jennie")){
				itr2.remove(); // can remove element from list
			}
		}
		System.out.println("list2 now is: "+list2);
		System.out.println();
		
		while(itr3.hasNext()){
			Student stu = itr3.next();
			System.out.println(stu);
		}
		
		//4. ListIterator API : Iterate in forward as well as backward direction
		System.out.println("===ListIterator===");
		ListIterator<String> listItr2 = list2.listIterator();
		
		while(listItr2.hasNext()){
			String nm = listItr2.next();
			System.out.println(nm);
		}
		
		System.out.println("------");
		
		// We can iterate in a backward direction only if we have iterated earlier in the forward direction
		while(listItr2.hasPrevious()){
			String nm = listItr2.previous();
			System.out.println(nm);
		}
		
		System.out.println();
		
		//5. Enumeration API : Read Only in List
		System.out.println("===Enumeration===");
		Enumeration<String> enm2 = Collections.enumeration(list2);
		while(enm2.hasMoreElements()){
			String nm = enm2.nextElement();
			System.out.println(nm); 
		}
		
		System.out.println();
		System.out.println("==Vector==");
		// Thread-Safe or Synchronized
		Vector<String> vector = new Vector<String>();
		vector.add("Mike");
		vector.add("Leo");
		vector.add("Fionna");
		vector.add("Sia");
		System.out.println(vector);		
		
		
		// Collections.sort(list2); -> Explore
		// Do Explore how to sort list3 with Student objects on the basis of roll number
		// -> Comparator API
		
	}

}
