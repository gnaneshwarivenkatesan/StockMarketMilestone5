package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;
import com.example.stockspring.model.StockPrice;

public interface SPriceService {
	public List<StockPrice> getPriceList() throws SQLException;
}
