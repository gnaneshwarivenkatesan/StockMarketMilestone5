package com.example.stockspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sectors")
public class Sector {
	@Id
	@Column(name="id")
private int sectorId;
	@Column(name="sector_name")
private String sectorName;
	@Column(name="brief")
private String brief;
public int getSectorId() {
	return sectorId;
}
public void setSectorId(int sectorId) {
	this.sectorId = sectorId;
}
public String getSectorName() {
	return sectorName;
}
public void setSectorName(String sectorName) {
	this.sectorName = sectorName;
}
public String getBrief() {
	return brief;
}
public void setBrief(String brief) {
	this.brief = brief;
}

}
