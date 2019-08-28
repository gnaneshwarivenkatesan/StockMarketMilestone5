package com.example.stockspring.controller;

import java.sql.SQLException;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.IPODetails;

public interface IpoController {
	public String insertIpoDetails(ModelMap model);
	    public String insertIpo(IPODetails ipo) throws SQLException;
    public IPODetails updateIpo(IPODetails ipo);
	public ModelAndView getIpoList() throws Exception;
}
