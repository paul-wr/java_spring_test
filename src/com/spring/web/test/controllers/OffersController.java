package com.spring.web.test.controllers;

import java.util.List;
import java.util.Map;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.web.test.dao.Offer;
import com.spring.web.test.service.OffersService;

@Controller
public class OffersController {
	
	private OffersService offersService; 

	
	/*@RequestMapping("/")
	public ModelAndView showHome(HttpSession session){
		
		session.setAttribute("name", "Robert");
		
		ModelAndView mv = new ModelAndView("home");
		
		Map<String, Object> model = mv.getModel();
		
		model.put("modelName", "Joan");
		
		return mv;
	}*/
	
	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String showTest(Model model, @RequestParam("id") String id){
		
		model.addAttribute("id", id);
		return "home";
	}

	@RequestMapping("/offers")
	public String showOffers(Model model){
		
		List<Offer> offers = offersService.getCurrent();
		
		model.addAttribute("offers", offers);
		
		return "offers";
	}
	
	@RequestMapping("/createoffer")
	public String createOffer(){
		
		return "createoffer";
	}
	
}
