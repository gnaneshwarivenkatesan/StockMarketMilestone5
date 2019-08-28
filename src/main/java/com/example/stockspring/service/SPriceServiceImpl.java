package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.SPriceDao;
import com.example.stockspring.model.StockPrice;

@Service
public class SPriceServiceImpl implements SPriceService{
	@Autowired
private SPriceDao sPriceDao;

	@Override
	public List<StockPrice> getPriceList() throws SQLException {
		// TODO Auto-generated method stub
		return sPriceDao.findAll();
	}

}
