package com.cognizant.ProductsCatalogService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@Column(name="ProductId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productid;
	@Column(name="ProductName")
	private String productname;
	@Column(name="ProductPrice")
	private int productprice;
	@Column(name="ProductDescription")
	private String productdescription;
	@Column(name="ProductImageUrl")
	private String productimageurl;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	public String getProductdescription() {
		return productdescription;
	}
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	public String getProductimageurl() {
		return productimageurl;
	}
	public void setProductimageurl(String productimageurl) {
		this.productimageurl = productimageurl;
	}
}
