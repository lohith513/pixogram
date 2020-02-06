package jdbcapp;

import java.sql.*;
import java.util.Scanner;
 class Myapp {



	public static void main(String[] args) {
		String name;
		String email;
		int age,phonenumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name of the student");
		name = sc.next();
		System.out.println("enter email of the student");
		email = sc.next();
		System.out.println("enter age of the student");
		age = sc.nextInt();
		System.out.println("enter phonenumber of the student");
		phonenumber = sc.nextInt();
		String query =" Insert into Students values ('"+name +"',"+age +",'"+email +"',"+phonenumber +")";
		
		try {
			// 1. Load driver in memory
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2. Set up a connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/studentdb?serverTimezone=UTC", "root", "");
			
			// 3. Create a statement
			Statement stmt = conn.createStatement();
			 
			// insert a record
			/*String  query = "insert into students set name='Fifth', email='fifth@mail.com'";
			int n = stmt.executeUpdate(query);
			System.out.println("Rows Added : " + n);
			*/
			
			ResultSet rs =  stmt.executeQuery("select * from students");
			
			while(rs.next()) {
				System.out.println(rs.getString(4));
			}
			int n = stmt.executeUpdate(query);
			rs.close();                                                                                                                                                                                   
			conn.close();
			
			
			/*ResultSet rs = stmt.executeQuery(""); // Retrieval  : select
			if(rs.next()) {
				rs.getString(1);  // 1 based indexing
				rs.getString("email");
			}
			
			while(rs.next()) {
				
			}
			
			int n = stmt.executeUpdate(""); // DMQ/DML : insert,update,delete
			// n : number of rows affected
			 
			 */
		}
		catch(Exception ex) {
			System.out.println(ex);
			
		}
	}

}
