package com.example.stockspring.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
@Entity
@Table(name="company")
public class Company {
	@Override
	public String toString() {
		return "Company [companyCode=" + companyCode + ", companyName=" + companyName + ", turnOver=" + turnOver
				+ ", ceo=" + ceo + ", boardOfDirectors=" + boardOfDirectors + ", sectorId=" + sectorId
				+ ", briefWriteup=" + briefWriteup + ", stockCode=" + stockCode + "]";
	}
	@Max(value=2000, message="Enter Proper company code")
	@Id
	@Column(name="company_code")
	private int companyCode;
	@Column(name="company_Name")
	private String companyName;
	@Column(name="turnover")
	private BigDecimal turnOver;
	@Column(name="ceo")
	private String ceo;
	@Column(name="boardofdirectors")
	private String boardOfDirectors;
@Column(name="sector_id")
private int sectorId;
	public int getSectorId() {
	return sectorId;
}
public void setSectorId(int sectorId) {
	this.sectorId = sectorId;
}
	@Column(name="breifwriteup")
	private String briefWriteup;
	@Column(name="stock_Code")
	private Integer stockCode;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public BigDecimal getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(BigDecimal turnOver) {
		this.turnOver = turnOver;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	public String getBriefWriteup() {
		return briefWriteup;
	}
	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}
	public Integer getStockCode() {
		return stockCode;
	}
	public void setStockCode(Integer stockCode) {
		this.stockCode = stockCode;
	}
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	
}
