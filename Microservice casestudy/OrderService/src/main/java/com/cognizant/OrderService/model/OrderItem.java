package com.cognizant.OrderService.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderItem {

	@Id
	@Column(name="OrderId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderid;
	@Column(name="UserId")
	private int userid;
	@Column(name="DeliverAddress")
	private String deliveryaddress;
	@Column(name="OrderDate")
	private Date orderdate;
	@Column(name="PaymentMode")
	private String paymentmode;
	@Column(name="OrderAmount")
	private int orderamount;
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	
	public String getDeliveryaddress() {
		return deliveryaddress;
	}
	public void setDeliveryaddress(String deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	public int getOrderamount() {
		return orderamount;
	}
	public void setOrderamount(int orderamount) {
		this.orderamount = orderamount;
	}
	
	
	
	
}
