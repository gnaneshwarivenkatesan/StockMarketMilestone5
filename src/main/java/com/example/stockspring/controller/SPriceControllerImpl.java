package com.example.stockspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.service.SPriceService;

@Controller
public class SPriceControllerImpl {
	@Autowired
private SPriceService sPriceService;
	@RequestMapping(path = "/stockList")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("stockList");
		mv.addObject("stockList", sPriceService.getPriceList());
		return mv;
	}
}
