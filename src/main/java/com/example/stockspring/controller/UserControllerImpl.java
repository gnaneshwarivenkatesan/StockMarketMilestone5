package com.example.stockspring.controller;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.User;

import com.example.stockspring.service.UserService;

@Controller
public class UserControllerImpl {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String insert(ModelMap model) {
		System.out.println("add user");
		User e = new User();
		// e.setEmail("sdfsf");
		// e.setSalary(4564.56f);
		model.addAttribute("e2", e);
		return "signup";

	}

	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String formHandler(@Valid @ModelAttribute("e2")User user, 
			BindingResult result, Model model) throws SQLException {
		System.out.println(user);
		if(result.hasErrors()){
			System.out.println("errors");
			System.out.println(result.getAllErrors());
			model.addAttribute("e2", user);
			return "signup";
		}
		userService.registerUser(user);
		//model.addAttribute("name", employee.getName());
		 return "redirect:/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
		System.out.println("logged in");
		User e = new User();
		model.addAttribute("login", e);
		return "login";

	}
	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
    public ModelAndView loginUser(@Valid @ModelAttribute("login") User user) throws Exception {

           ModelAndView mav = null;

           String name = user.getUserName();

           List<User> user1 = userService.findByuserName(name);
           System.out.println(user1);
           User user2 = user1.get(0);
           System.out.println(user2);
           if ((user.getUserName().equals(user2.getUserName())) && (user.getPassword().equals(user2.getPassword()))) {
        	  System.out.println("this is sample");
                  if (user2.getUserType().equals("Admin")) {
                	  System.out.println("this is sample if");
                        mav = new ModelAndView("adminLandingPage");
                  } else {
                	  System.out.println("this is sample");
                        mav = new ModelAndView("userLandingPage");
                  }
           } else {

                  mav = new ModelAndView("login", "message", "Invalid Username or Password");
           }

           return mav;

    }

	
}
