package com.jsp.Vmart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.Vmart.Connection.VmartConnection;
import com.jsp.Vmart.dto.product;

public class VmartDao {
	
	Connection connection = VmartConnection.getProductConnection();
	/*
	 * insert method for product
	 */
	public  product insertproduct(product Product) {
		String insertQuery="insert into product values(?,?,?)";
		
		try {
			PreparedStatement ps=connection.prepareStatement(insertQuery);
			ps.setInt(1, Product.getproductId());
			ps.setString(2, Product.getproductName());
			ps.setInt(3, Product.getproductPrice());
			
			ps.execute();
			return Product;
					
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
		
		
	}
	public int updateProductName(int productId, String productName)
	{
		String updateProductNameQuery="update product set name=? where productid=? ";
		try {
			PreparedStatement ps=connection.prepareStatement(updateProductNameQuery);
			ps.setInt(2, productId);
			ps.setString(1, productName);
			return ps.executeUpdate();
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return 0;
		
	}
	
	
	
	
	
}
