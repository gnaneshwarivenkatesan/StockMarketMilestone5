package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.StockDao;
import com.example.stockspring.model.StockExchange;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private StockDao stockDao;

	public StockExchange insertStockExchange(StockExchange stock) throws SQLException {
		// TODO Auto-generated method stub
		return stockDao.save(stock);
	}

	@Override
	public StockExchange updateStockExchange(StockExchange stock) {
		// TODO Auto-generated method stub
		return stockDao.save(stock);
	}

	@Override
	public List<StockExchange> getStockExchangeList() throws SQLException {
		return stockDao.findAll();
	}

	
	
	@Override
	public StockExchange findByid(int id) {
		// TODO Auto-generated method stub
		return stockDao.getOne(id);
	}

	@Override
	public void deleteByid(int stock) {
		// TODO Auto-generated method stub
		stockDao.deleteById(stock);
	}

}
