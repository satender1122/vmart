package com.jsp.Vmart.controller;

import java.util.Scanner;

import com.jsp.Vmart.dto.product;
import com.jsp.Vmart.service.ProductService;

public class VmartController {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		product Product=null;
		
		System.out.println("1. Insert\n 2. Update");
		System.out.println("Enter the option");
		int ch=scanner.nextInt();
		ProductService ps=new ProductService();
		
		switch(ch) {
		case 1:{
			System.out.println("enter id");
			int id=scanner.nextInt();
			System.out.println("enter name");
			String name=scanner.next();
			System.out.println("enter price");
			int price=scanner.nextInt();
			Product=new product (id, name, price);
			ps.insertProductService(Product);
		}
		break;
		}
		System.out.println("data save");
		
		
	}

}
