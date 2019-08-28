package com.example.stockspring.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.stockspring.model.StockPrice;

public interface SPriceDao extends JpaRepository<StockPrice, Integer> {
	  
	public List<StockPrice> findBycompanyCode(@Param("companyCode") int companyCode);
	/*@Query("Select s from StockPrice s where s.date BETWEEN :fromDate AND :toDate")
	public List<StockPrice> findBydate(@Param(value="fromDate") Date fromDate,@Param(value="toDate") Date toDate);*/
	@Query("select s.currentPrice from StockPrice s where s.companyCode=:companyCode and s.sdate between :fromDate and :toDate")
	public List<Double> findBycompanyCode(@Param(value="companyCode") int companyCode,@Param(value = "fromDate") Date fromDate, @Param(value = "toDate") Date toDate);

}

