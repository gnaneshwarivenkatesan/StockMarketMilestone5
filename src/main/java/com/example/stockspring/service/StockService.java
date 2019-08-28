package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.StockExchange;

public interface StockService {
	 public StockExchange updateStockExchange(StockExchange stock);
		public List<StockExchange> getStockExchangeList() throws SQLException;
		
		public StockExchange insertStockExchange(StockExchange stock) throws SQLException ;
		public StockExchange findByid(int id);
		public void deleteByid(int stock);
}
