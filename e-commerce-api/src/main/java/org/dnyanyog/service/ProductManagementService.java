package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.dnyanyog.common.DBUtil;
import org.dnyanyog.dto.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductManagementService {
	
	public List<Product> getAllProducts() throws SQLException{
		
		ArrayList<Product> list = new ArrayList<>();
		
		String selectQuery = "select * from product";
		ResultSet result = DBUtil.executeSelectQuery(selectQuery);
		while(result.next()) {
			Product product = new Product();
			product.product_name = result.getString(1);
			product.product_quantity = result.getNString(1);
			product.product_price = result.getNString(3);
			
			list.add(product);
		}
		
		return list;
		
	}

}
