package com.jsp.Vmart.dto;

public class product {
	private int productId;
	private String productName;
	private int productPrice;
	
	public product()
	{
		super();
	}
	public product(int productId, String productName, int productPrice)
	{
		super();
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productPrice;
	}
	public int getproductId()
	{
		return productId;
	}
	public String getproductName()
	{
		return productName;
	}
	public int getproductPrice()
	{
		return productPrice;
	}
	public void setproductId(int productId)
	{
		this.productId=productId;
	}
	public void setproductName(String productName)
	{
		this.productName=productName;
	}
    public void setproductPrice(int productPrice)
    {
    	this.productPrice=productPrice;
    }
	@Override
	public String toString() {
		return "product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", getproductId()=" + getproductId() + ", getproductName()=" + getproductName()
				+ ", getproductPrice()=" + getproductPrice() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
    
}




















	
