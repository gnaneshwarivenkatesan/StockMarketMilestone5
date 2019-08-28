package com.example.stockspring.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.stockspring.model.Company;


public interface CompanyDao extends JpaRepository<Company, Integer> {
	  
public List<Company> findBysectorId(@Param("sectorId") int sector);
/*@Query("Select c From Company c where c.companyName LIKE %:letter%")*/
public List<Company> findBycompanyName(@Param(value="letter") String letter);


@Query("select c.companyCode from Company c where c.sectorId=:sectorid")
int[] findSectorList(@Param("sectorid")int sectorid);

}
