package service;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import model.Events_model;

public class Events implements IEvent {

	@Override
	public int addEvent(Events_model pr) {
		int xid=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/event_plan","root" ,"");
			String sql="insert into events (event_name,type,type2,city,pay_plan,price,description,cont_name,cont_phone,feature_1,feature_2,feature_3,feature_4,link) values('"+pr.getEvent_name()+"','"+pr.getType()+"','"+pr.getType2()+"','"+pr.getCity()+"','"+pr.getPay_plan()+"',"+pr.getPrice()+",'"+pr.getDescription()+"','"+pr.getCont_name()+"','"+pr.getCont_phone()+"','"+pr.getFeature_1()+"','"+pr.getFeature_2()+"','"+pr.getFeature_3()+"','"+pr.getFeature_4()+"','"+pr.getLink()+"')";  
			Statement st= (Statement) con.createStatement();
			st.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
			ResultSet rs = st.getGeneratedKeys();
	        if (rs.next()) {
	             xid = rs.getInt(1);
	        }
			
			con.close();
			return xid;
			
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public void removeEvent(int id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/event_plan","root" ,"");
			String sql="update events set status = 'del' where e_id = " +id; 
			Statement st= (Statement) con.createStatement();
			st.execute(sql);
			con.close();
		
			
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public model.Events_model getEventById(int id) {
		model.Events_model Pro=new model.Events_model();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/event_plan","root" ,"");
			String sql="select * from events where e_id = "+id;  
			Statement st= (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) {
			
				Pro.setId(id);
				Pro.setEvent_name(rs.getString("event_name"));
				Pro.setType(rs.getString("type"));
				Pro.setType2(rs.getString("type2"));
				Pro.setCity(rs.getString("city"));
				Pro.setPay_plan(rs.getString("pay_plan"));
				Pro.setAmount(rs.getDouble("price"));
				Pro.setDescription(rs.getString("description"));
				Pro.setCont_name(rs.getString("cont_name"));
				Pro.setCont_phone(rs.getString("cont_phone"));
				Pro.setFeature_1(rs.getString("feature_1"));
				Pro.setFeature_2(rs.getString("feature_2"));
				Pro.setFeature_3(rs.getString("feature_3"));
				Pro.setFeature_4(rs.getString("feature_4"));
				Pro.setLink(rs.getString("link"));
			}
			
			con.close();
		
			
		} 
		
		catch (ClassNotFoundException |SQLException e) 
		{
			e.printStackTrace();
		}
		
		return Pro;
	}

	@Override
	public List<Events_model> getAllEvent() {
		List<model.Events_model> PL = new ArrayList<model.Events_model>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/event_plan","root" ,"");
			String sql="select * from events where status = 'active'";  
			Statement st= (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next())
			{
				model.Events_model P = new model.Events_model();
				P.setId(Integer.parseInt(rs.getString("e_id")));
				P.setEvent_name(rs.getString("event_name"));
				P.setType(rs.getString("type"));
				P.setType2 (rs.getString("type2"));
				P.setCity(rs.getString("city"));
				P.setPay_plan(rs.getString("pay_plan"));
				P.setAmount(rs.getDouble("price"));	
				P.setDescription(rs.getString("description"));
				P.setCont_name(rs.getString("cont_name"));
				P.setCont_phone(rs.getString("cont_phone"));
				P.setFeature_1(rs.getString("feature_1"));
				P.setFeature_2(rs.getString("feature_2"));
				P.setFeature_3(rs.getString("feature_3"));
				P.setFeature_4(rs.getString("feature_4"));
				P.setLink(rs.getString("link"));
				P.setFeatured(rs.getString("featured"));
				P.setListed(rs.getString("listed"));
				
				PL.add(P);
			}
			
			con.close();
		
			
		} 
		
		catch (ClassNotFoundException |SQLException e) 
		{
			e.printStackTrace();
		}
		
		return PL;
		
	}

	@Override
	public void updateEvent(Events_model p) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/event_plan","root" ,"");
			String sql="update events set event_name = '"+p.getEvent_name()+"', type = '"+p.getType()+"',type2 = '"+p.getType2()+"', city = '"+p.getCity()+"',pay_plan = '"+p.getPay_plan()+"',price = '"+p.getPrice()+"' ,description = '"+p.getDescription()+"' ,cont_name = '"+p.getCont_name()+"' ,cont_phone = '"+p.getCont_phone()+"' ,feature_1 = '"+p.getFeature_1()+"' ,feature_2 = '"+p.getFeature_2()+"' ,feature_3 = '"+p.getFeature_3()+"' ,feature_4 = '"+p.getFeature_4()+"', link = '"+p.getLink()+"' where e_id = "+p.getId(); 
			Statement st= (Statement) con.createStatement();
			st.execute(sql);
			con.close();
		
			
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public List<Events_model> getAllFeatured() {
		List<model.Events_model> Pro = new ArrayList<model.Events_model>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/event_plan","root" ,"");
			String sql="select * from events where f_id = 2";  
			Statement st= (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next())
			{
				model.Events_model P = new model.Events_model();
				
				P.setId(Integer.parseInt(rs.getString("e_id")));
				P.setEvent_name(rs.getString("event_name"));
				P.setType(rs.getString("type"));
				P.setType2 (rs.getString("type2"));
				P.setCity(rs.getString("city"));
				P.setPay_plan(rs.getString("pay_plan"));
				P.setAmount(rs.getDouble("price"));	
				P.setDescription(rs.getString("description"));
				P.setCont_name(rs.getString("cont_name"));
				P.setCont_phone(rs.getString("cont_phone"));
				P.setFeature_1(rs.getString("feature_1"));
				P.setFeature_2(rs.getString("feature_2"));
				P.setFeature_3(rs.getString("feature_3"));
				P.setFeature_4(rs.getString("feature_4"));
				P.setLink(rs.getString("link"));
				P.setFeatured(rs.getString("featured"));
				P.setListed(rs.getString("listed"));
				
				Pro.add(P);
			}
			
			con.close();
		
			
		} 
		
		catch (ClassNotFoundException |SQLException e) 
		{
			e.printStackTrace();
		}
		
		return Pro;
		
	}

	@Override
	public List<Events_model> getAllDel() {
		List<model.Events_model> PD = new ArrayList<model.Events_model>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/event_plan","root" ,"");
			String sql="select * from events where status = 'del'";  
			Statement st= (Statement) con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next())
			{
				model.Events_model P = new model.Events_model();
				P.setId(Integer.parseInt(rs.getString("e_id")));
				P.setEvent_name(rs.getString("event_name"));
				P.setType(rs.getString("type"));
				P.setType2 (rs.getString("type2"));
				P.setCity(rs.getString("city"));
				P.setPay_plan(rs.getString("pay_plan"));
				P.setAmount(rs.getDouble("price"));	
				P.setDescription(rs.getString("description"));
				P.setCont_name(rs.getString("cont_name"));
				P.setCont_phone(rs.getString("cont_phone"));
				P.setFeature_1(rs.getString("feature_1"));
				P.setFeature_2(rs.getString("feature_2"));
				P.setFeature_3(rs.getString("feature_3"));
				P.setFeature_4(rs.getString("feature_4"));
				P.setLink(rs.getString("link"));
				P.setFeatured(rs.getString("featured"));
				P.setListed(rs.getString("listed"));
				
				PD.add(P);
			}
			
			con.close();
		
			
		} 
		
		catch (ClassNotFoundException |SQLException e) 
		{
			e.printStackTrace();
		}
		
		return PD;
		
	}

	
}
