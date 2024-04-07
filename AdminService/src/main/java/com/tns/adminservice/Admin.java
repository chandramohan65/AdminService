package com.tns.adminservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin 
{
	@Id
	@Column(name="adminid")
	private int adminid;
	
	@Column(name="adminname")
	private String adminname;
		
	@Column(name="password")
	private String password;
	
	@Column(name="productid")
	private int productid;

	@Column(name="productname")
	private String productname;
	
	@Column(name="totalprice")
	private double totalprice;

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	public Admin(int adminid, String adminname, String password, int productid, String productname, double totalprice) {
		super();
		this.adminid = adminid;
		this.adminname = adminname;
		this.password = password;
		this.productid = productid;
		this.productname = productname;
		this.totalprice = totalprice;
	}
	

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Generate toString()
		@Override
		public String toString() {
			return "Admin [adminid=" + adminid + ", adminname=" + adminname + ", password=" + password + ", productid=" + productid
					+ ", productname=" + productname + ", totalprice=" + totalprice + "]";
		}
	
	
}
