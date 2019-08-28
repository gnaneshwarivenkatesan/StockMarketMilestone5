package com.example.stockspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stockexchange")
public class StockExchange {
	@Id
	@Column(name="stockexchange_id")
	private int id;
	@Column(name="stockexchange_name")
	private String stockExchange_name;
	@Column(name="brief")
	private String brief;
	@Column(name="contactaddress")
	private String contactAddress;
	@Column(name="remarks")
	private String remarks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getStockExchange_name() {
		return stockExchange_name;
	}

	public void setStockExchange_name(String stockExchange_name) {
		this.stockExchange_name = stockExchange_name;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
