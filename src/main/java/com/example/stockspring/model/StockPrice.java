package com.example.stockspring.model;

import java.sql.Time;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="stock_price")
public class StockPrice {
	@Column(name="company_code")
	private int companyCode;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stock_code")
	private int stockCode;
	
	public int getStockCode() {
		return stockCode;
	}

	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}

	@Column(name="stock_exchange")
	private String stockExchange;
	@Column(name="current_price")
	private double currentPrice;
	@Column(name="sdate")
	private Date sdate;
	@Column(name="time")
	private String time;
	
	

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Date getDate() {
		return sdate;
	}

	public void setDate(Date date) {
		this.sdate = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}



}
