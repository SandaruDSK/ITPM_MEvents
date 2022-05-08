package com;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.DBconnection;

public class PaymentDao {
	
	
	 public boolean addPayment(Payment payment) {
		    // TODO Auto-generated method stub
		    Connection con = DBconnection.getConn();
		    String sql = "insert into payment (id,fname,lname,ctype,cnumber,exmonth,exyear,cvn,tot) values (NULL,?,?,?,?,?,?,?,?) ";
		    int i = 0;
		    try {
		      PreparedStatement preparedStatement = con.prepareStatement(sql);
		      preparedStatement.setString(1, payment.getFname());
		      preparedStatement.setString(2, payment.getLname());
		      preparedStatement.setString(3, payment.getCtype());
		      preparedStatement.setInt(4, payment.getCnumber());
		      preparedStatement.setInt(5, payment.getExmonth());
		      preparedStatement.setInt(6, payment.getExyear());
		      preparedStatement.setInt(7, payment.getCvn());
		      preparedStatement.setDouble(8, payment.getTot());
		      
		      i = preparedStatement.executeUpdate();
		    } catch (SQLException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    }
		    if (i == 0) {
		      return false;
		    } else {
		      return true;
		    }
		  }
		  public boolean editPayment(Payment payment) {
		    Connection connection = DBconnection.getConn();
		    String sql = "update payment set fname=?, lname=?, ctype=?, cnumber=?, exmonth=?, exyear=?, cvn=?, tot=?";
		    sql += " where id=? ";

		    int i = 0;
		    try {
		      PreparedStatement preparedStatement = connection.prepareStatement(sql);
		      preparedStatement.setString(1, payment.getFname());
		      preparedStatement.setString(2, payment.getLname());
		      preparedStatement.setString(3, payment.getCtype());
		      preparedStatement.setInt(4, payment.getCnumber());
		      preparedStatement.setInt(5, payment.getExmonth());
		      preparedStatement.setInt(6, payment.getExyear());
		      preparedStatement.setInt(7, payment.getCvn());
		      preparedStatement.setDouble(8, payment.getTot());
		      preparedStatement.setInt(9, payment.getId());
		      i = preparedStatement.executeUpdate();
		    } catch (SQLException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    }
		    if (i == 0) {
		      return false;
		    } else {
		      return true;
		    }
		  }
		  public void deletePayment(int id) {
		    Connection connection = DBconnection.getConn();
		    String sql = "delete from payment where id=?";
		    try {
		      PreparedStatement preparedStatement = connection.prepareStatement(sql);
		      preparedStatement.setInt(1, id);
		      preparedStatement.executeUpdate();
		    } catch (SQLException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    }
		  }
		}


