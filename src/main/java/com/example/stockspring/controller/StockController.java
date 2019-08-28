package com.example.stockspring.controller;

import java.sql.SQLException;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.StockExchange;

public interface StockController {
	public String insertStock(ModelMap model);
	    public String insertStock(StockExchange stock) throws SQLException;
    public StockExchange updateStockExchange(StockExchange stock);
	public ModelAndView getStockExchangeList() throws Exception;
}
