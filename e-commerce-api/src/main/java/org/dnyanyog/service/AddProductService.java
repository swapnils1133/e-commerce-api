package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.common.DBUtil;
import org.dnyanyog.dto.AddProductRequest;
import org.dnyanyog.dto.AddProductResponse;

public class AddProductService {
	
	public AddProductResponse addProduct(AddProductRequest addProductRequest) throws SQLException {
		
		AddProductResponse addProductResponse = new AddProductResponse();
		String insertQuery = "insert into product(product_name,product_quantity,product_price) values('"+addProductRequest.Product_name+"','"+addProductRequest.product_quantity+"','"+addProductRequest.product_price+"')";
		DBUtil.executequery(insertQuery);
		String selectQuery = "select * from product where product_name='"+addProductRequest.Product_name+"'";
		ResultSet result = DBUtil.executeSelectQuery(selectQuery);
		if(result.next()) {
			addProductResponse.errorCode="0000";
			addProductResponse.message="Add Product Successfully";
			return addProductResponse;
		}
		
		else {
			addProductResponse.errorCode="911";
			addProductResponse.message="Product Addition Failed";
			return addProductResponse;
		}
	}

}

