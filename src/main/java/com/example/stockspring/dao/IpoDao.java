package com.example.stockspring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.stockspring.model.IPODetails;

public interface IpoDao extends JpaRepository<IPODetails, Integer> {
	  
public List<IPODetails> findBycompanyCode(@Param("companyCode") int companyCode);

}
