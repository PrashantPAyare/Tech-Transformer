package com.pearsonVue.PearsonVue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	public MailMsg mailMsg;
	
	@RequestMapping("welcome")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		
		System.out.println("Hi");
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping("login")
	public ModelAndView signIn() {
		System.out.println("executing login controller method.");
		return new ModelAndView("send", "mailMessage", mailMsg);
	}
	
	
	
}
