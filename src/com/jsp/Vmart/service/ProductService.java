package com.jsp.Vmart.service;

import com.jsp.Vmart.dao.VmartDao;
import com.jsp.Vmart.dto.product;

public class ProductService {
	
	VmartDao vmartDao = new VmartDao();
	
	public product insertProductService(com.jsp.Vmart.dto.product Product)
	{
		if(Product.getproductId()<9999)
		{
			product Product2=vmartDao.insertproduct(Product);		
			return Product2;
		}
		else {
			System.out.println("id not bigger then 4 digit");
		}
		return null;
		
	}
}
