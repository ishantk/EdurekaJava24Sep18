package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.Employee;

/*
	JDBC Procedure:
	1. Load the Driver
	   1.1 Download Typ4 Driver jar file from DB Vendor Website
	   1.2 Link the jar file with your project
	   1.3 Use Class.forname API to load the driver
	
	2. Create Connection with DB
		2.1 URL : jdbc:mysql://localhost/edureka
		2.2 user: root
		2.3 password
		2.4 Use Connection and DriverManager API to create Connection
		
	3. Write SQL Statement
		String sql = "insert into Employee values(null,'John','+91 98989 98989','R&D',70000)";
		
	4. Execute SQL Statement
		Use Statement or PreparedStatement API to execute SQL from Java
		
	5. Close the Connection
		call close() method on Connection
	
 */

// Design Pattern (OOPS) -> DAO i.e. Data Access Object
public class JDBCHelper {

	Connection con;
	Statement stmt;
	PreparedStatement pStmt;
	CallableStatement cStmt;
	
	// 1. Load the Driver
	public JDBCHelper() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(">> Driver Loaded");
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	// 2. Create Connection with DB
	public void createConnection(){
		try {
			
			// URL will vary from DB to DB
			String url = "jdbc:mysql://localhost/edureka";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			
			System.out.println(">> Connection Created");
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	// 3. Write SQL Statement
	// 4. Execute SQL Statement
	public void insertEmployee(Employee emp){
		try {
			
			// 3. Write SQL Statement
			//String sql = "insert into Employee values(null,'"+emp.name+"','"+emp.phone+"','"+emp.dept+"',"+emp.salary+")";
			
			// 4. Execute SQL Statement
			//stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql); //executeUpdate which will fire insert, update and delete SQL commands
			
			String sql = "insert into Employee values(null, ?, ?, ?, ?)"; // ? Wild card character
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, emp.name);
			pStmt.setString(2, emp.phone);
			pStmt.setString(3, emp.dept);
			pStmt.setInt(4, emp.salary);
			
			int i = pStmt.executeUpdate();
			
			if(i>0){
				System.out.println(">> "+emp.name+" Inserted");
			}else{
				System.out.println(">> "+emp.name+" Not Inserted");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void updateEmployee(Employee emp){
		
		try {
			
			String sql = "update Employee set name = ?, phone = ?, dept = ?, salary = ? where id = ?";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, emp.name);
			pStmt.setString(2, emp.phone);
			pStmt.setString(3, emp.dept);
			pStmt.setInt(4, emp.salary);
			pStmt.setInt(5, emp.id);
			
			int i = pStmt.executeUpdate();
			
			if(i>0){
				System.out.println(">> "+emp.name+" Updated");
			}else{
				System.out.println(">> "+emp.name+" Not Updated");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void deleteEmployee(int id){
		
		try {
			
			String sql = "delete from Employee where id = ?";
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, id);
			
			int i = pStmt.executeUpdate();
			
			if(i>0){
				System.out.println(">> ID:"+id+" Deleted");
			}else{
				System.out.println(">> ID:"+id+" Not Deleted");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public ArrayList<Employee> getEmployees(){
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		try {
			
			String sql = "select * from Employee";
			pStmt = con.prepareStatement(sql);			
			
			ResultSet rs = pStmt.executeQuery(); // executeQuery to fetch records as ResultSet
			
			while(rs.next()){
				Employee emp = new Employee();
				emp.id = rs.getInt(1);
				emp.name = rs.getString(2);
				emp.phone = rs.getString(3);
				emp.dept = rs.getString(4);
				emp.salary = rs.getInt(5);
				
				//System.out.println(emp);
				//System.out.println();
				
				employees.add(emp); // employees contains all the Employee objects
				// Employee Object contains data from the table row
			}
			
			rs.close();
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
		return employees;
	}
	
	public void executeProcedure(Employee emp){
		
		try {
			
			String sql = "{ call addEmployee(?, ?, ?, ?) }";
			
			cStmt = con.prepareCall(sql);
			cStmt.setString(1, emp.name);
			cStmt.setString(2, emp.phone);
			cStmt.setString(3, emp.dept);
			cStmt.setInt(4, emp.salary);
			
			cStmt.execute();
			System.out.println(">> Procedure Executed");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void processBatch(){
		try {
			
			String sql1 = "delete from Employee where id = 4";
			String sql2 = "update Employee set ename = 'George Gim', phone='+91 90909 90909' where id = 7"; // wrong column name
			
			con.setAutoCommit(false);
			
			// Batch Processing
			stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			
			stmt.executeBatch();
			
			// Make Batch Processing a Transaction
			// It will ensure Atomicity !! i.e. All statements should execute !! None should fail !!
			con.commit(); 
			System.out.println(">> Batch Processed");
		} catch (Exception e) {
			try {
				con.rollback();
				System.out.println(">> Connection Rollbacked");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	// 5. Close the Connection
	public void closeConnection(){
		try {
			//stmt.close();
			//pStmt.close();
			//cStmt.close();
			con.close();
			System.out.println(">> Connection Closed");
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
}
