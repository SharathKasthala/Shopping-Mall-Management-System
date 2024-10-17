package com.tns.project.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity

public class Shop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long shopId;
	//private enum shopCategory{ WHOLESALE , RETAIL };
	//private List<Employee>shopEmployees; 
	private String shopName;
	//private List<Customer> customers;
	//private enum shopStatus{ OPEN , CLOSED};
	//private ShopOwner shopOwner;
	private String leaseStatus;
	public Shop() {
		super();
	}
	public Shop(Long shopId, String shopName, String leaseStatus) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.leaseStatus = leaseStatus;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getLeaseStatus() {
		return leaseStatus;
	}
	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopName=" + shopName + ", leaseStatus=" + leaseStatus + "]";
	}
	

}
