package com.example.stockspring.controller;

import java.sql.SQLException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.IPODetails;
import com.example.stockspring.service.CompanyService;
import com.example.stockspring.service.IpoService;

@Controller
public class IpoControllerImpl {

	@Autowired
	private IpoService ipoService;

	@RequestMapping(path = "/ipoList")
	public ModelAndView getIpoList() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ipoList");
		mv.addObject("ipoList", ipoService.getIpoList());
		return mv;
	}

	@RequestMapping(value = "/ipoDetails", method = RequestMethod.GET)
	public String insert(ModelMap model) {
		System.out.println("add ipo");
		IPODetails e = new IPODetails();
		// e.setEmail("sdfsf");
		// e.setSalary(4564.56f);
		model.addAttribute("ipo", e);
		return "IpoDetails";

	}

	@RequestMapping(value = "/ipoDetails", method = RequestMethod.POST)
	public String formHandler(@Valid IPODetails ipo, BindingResult result, Model model) throws SQLException {
		System.out.println(ipo);
		if (result.hasErrors()) {
			System.out.println("errors");
			System.out.println(result.getAllErrors());
			model.addAttribute("ipo", ipo);
			return "IpoDetails";
		}

		ipoService.insertIpo(ipo);
		// model.addAttribute("name", employee.getName());
		return "redirect:/ipoList";
	}

	@RequestMapping(value = "/ipo", method = RequestMethod.GET)
	public String updateIPO(ModelMap model, @RequestParam("id") int ipo,
			@ModelAttribute("ipoUpdate") IPODetails ipoDetails) {
		ipoDetails = ipoService.findByid(ipo);
		model.addAttribute("ipoUp", ipoDetails);
		return "updateIpo";
	}

	@RequestMapping(value = "/ipo", method = RequestMethod.POST)
	public String updateIPO(@ModelAttribute("ipoUpdate") IPODetails ipo, Model model) throws SQLException {
		ipoService.updateIpo(ipo);

		return "redirect:/ipoList";

	}
	@RequestMapping(value = "/deleteIpo", method = RequestMethod.GET)
	public String deleteIpo(ModelMap model, @RequestParam("id") int ipo1,
			@ModelAttribute("ipoUpdate") IPODetails ipo ) {
		ipoService.deletebyid(ipo1);
		
		return "redirect:/ipoList";
	}
}
