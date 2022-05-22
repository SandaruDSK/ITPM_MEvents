package com.contactusAdmin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ContactusAdminDBUtil {
	
	//Insert data
	public static int insertcontactusdetails(String name, String contactnumber, String email, String message) {
		
		boolean isSuccess = false;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/itpm_mevents", "root", ""); 
			Statement stmt = con.createStatement();
			String sql = "insert into contact_us values (0,'"+name+"','"+contactnumber+"','"+email+"','"+message+"')";
			int rs = stmt.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
			
			return rs;
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	
	//Update data
	public static int updatecontactusdetails(String id, String name, String contactnumber, String email,String message) {
	    	
		boolean isSuccess = false;
	    	
			try {
	    		
	    		Class.forName("com.mysql.jdbc.Driver");
				
				Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/itpm_mevents", "root", ""); 
				Statement stmt = con.createStatement();
	    		String sql = "update contact_us set id='"+id+"',name='"+name+"',contactnumber='"+contactnumber+"',email='"+email+"',message='"+message+"'";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		return rs;
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	
			return -1;
	    }
	
	//Retrieve data
	public static List<ContactusAdmin> getcontactusdetails() {
	    	
			List<ContactusAdmin> contactd = new ArrayList<ContactusAdmin>();
		
	    	try {
	    		
	    		Class.forName("com.mysql.jdbc.Driver");
				
				Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/itpm_mevents", "root", ""); 
				Statement stmt = con.createStatement();
	    		String sql = "select * from contact_us ";
	    		ResultSet rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    			int id = rs.getInt(1);
	    			String name = rs.getString(2);
	    			String contactnumber = rs.getString(3);
	    			String email = rs.getString(4);
	    			String message = rs.getString(5);
	    			
	    			ContactusAdmin c = new ContactusAdmin(id,name,contactnumber,email,message);
	    			contactd.add(c);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}	
	    	return contactd;	
	    }
	
	//Delete
	public void removecontactusdetails(int id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/itpm_mevents","root" ,"");
			String sql="delete from contact_us where id =" +id; 
			Statement st= (Statement) con.createStatement();
			st.execute(sql);
			con.close();
		
			
		} catch (ClassNotFoundException |SQLException e) {

			e.printStackTrace();
		}
		
	}
	
	//Select by ID
	public ContactusAdmin getContactusdetailsById(int id) {
		ContactusAdmin Pro=new ContactusAdmin();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/itpm_mevents","root" ,"");
			String sql="select * from contact_us where id = "+id;  
			Statement st= (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) {
			
				Pro.setId(id);
				Pro.setName(rs.getString("name"));
				Pro.setContactnumber(rs.getString("contactnumber"));
				Pro.setEmail(rs.getString("email"));
				Pro.setMessage(rs.getString("message"));
			}
			
			con.close();
		
			
		} 
		
		catch (ClassNotFoundException |SQLException e) 
		{
			e.printStackTrace();
		}
		
		return Pro;
	}
	
}
