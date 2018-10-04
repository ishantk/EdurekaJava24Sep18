package co.edureka.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

class Employee{
	
	int eid;
	String name;
	int salary;
	
	Employee(){
		
	}
	
	Employee(int eid, String name, int salary){
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	
	void showEmployee(){
		System.out.println(eid+" belongs to "+name+" and withdraws "+salary);
	}
	
	String employeeDetailsInCSV(){
		String csv = eid+","+name+","+salary+"\n";
		return csv;
	}
}

public class FileIO {

	// Persistance : Saving the data of an Object(data is in RAM) in a File permanently
	void writeInFile(Employee emp){
		
		try {
			
			// File will point to the File in disk
			File file = new File("/Users/ishantkumar/Downloads/employees4oct.csv");
			/*if(file.exists()){
				System.out.println(file.getName()+" Exists !!");
			}else{
				System.out.println(file.getName()+" does not Exists !!");
			}*/
			//file.isDirectory() //file.isFile()
			
			/*
			//1. FileOutputStream : Write the data in file in the form of bytes
			//FileOutputStream fos = new FileOutputStream(file);
			FileOutputStream fos = new FileOutputStream(file,true); // true: appendMode
			String data = emp.employeeDetailsInCSV();
			fos.write(data.getBytes());
			fos.close(); // release the memory resources
			*/
			
			//2. FileWriter : Write the data in file in the form of text
			//FileWriter writer = new FileWriter(file);
			FileWriter writer = new FileWriter(file,true); // true: appendMode
			//writer.append(); Another API to append
			String data = emp.employeeDetailsInCSV();
			writer.write(data);
			writer.close();
			
			System.out.println(">> Data Written in : "+file.getName());
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
			e.printStackTrace();
		}
		
	}
	
	void readFromFile(){
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/employees4oct.csv");
			
			//1. FileInputStream : Read the data from file in the form of bytes
			/*FileInputStream fis = new FileInputStream(file);
			
			int i = 0;
			char ch = ' ';
			while( (i = fis.read()) != -1){ // -1 is the end of file
				ch = (char)i; // down-casting byte as character
				System.out.print(ch);
			}
			
			fis.close();*/
			
			//2. FileReader : Read the data from file in the form of text
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader); // It can read contents line by line
			
			String line = "";
			while((line = buffer.readLine()) != null){ // null shall be end of file
				System.out.println(line);
				
				String[] arr = line.split(",");
				int eid = Integer.parseInt(arr[0]);
				String name = arr[1];
				int salary = Integer.parseInt(arr[2]);
				
				// From File we got the data back into the object !!
				Employee emp = new Employee(eid, name, salary);
				emp.showEmployee();
				
			}
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		//Employee emp1 = new Employee(101,"John",30000);
		//emp1.showEmployee();
		//System.out.println(emp1.employeeDetailsInCSV());

		//Employee emp4 = new Employee(701,"Harry",4000);
		//Employee emp5 = new Employee(801,"George",90000);
		
		
		FileIO io = new FileIO();
		//io.writeInFile(emp4);
		//io.writeInFile(emp5);
		
		io.readFromFile();
		
		int i = 10; // 32 bit container
		byte b = (byte)i; // error : 32 bit data is being written in 8 bit container -> Down-casting
		
		short s = 100;
		long l = s;      // Up-casting
		
	}

}
