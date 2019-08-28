 package com.example.stockspring.model;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ipo_planned")
public class IPODetails {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="company_code")
	private int companyCode;
	@Column(name="stock_exchange")
	private int stockExchange;
	@Column(name="price_per_share")
	private float pricePerShare;
	@Column(name="total_no_of_shares")
	private int totalNumOfshares;
	@Column(name="open_date_time")
	private String openDateTime;
	
	@Column(name="remarks")
	private String remarks;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public int getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(int stockExchange) {
		this.stockExchange = stockExchange;
	}
	public float getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(float pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public int getTotalNumOfshares() {
		return totalNumOfshares;
	}
	public void setTotalNumOfshares(int totalNumOfshares) {
		this.totalNumOfshares = totalNumOfshares;
	}
	public String getOpenDateTime() {
		return openDateTime;
	}
	public void setOpenDateTime(String openDateTime) {
		this.openDateTime = openDateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
