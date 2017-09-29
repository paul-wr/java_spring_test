package com.spring.web.test.controllers;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.web.test.dao.Offer;
import com.spring.web.test.dao.OffersDAO;
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
	
	
	
	/*
	@ExceptionHandler(DataAccessException.class)
	public String handleDatabaseException(DataAccessException ex){
		return "error";
	}
	*/
	

	@RequestMapping("/offers")
	public String showOffers(Model model){
		
		offersService.throwTestException();
		
		List<Offer> offers = offersService.getCurrent();
		
		model.addAttribute("offers", offers);
		
		return "offers";
	}
	
	@RequestMapping("/createoffer")
	public String createOffer(Model model){
		
		model.addAttribute("offer", new Offer());
		
		return "createoffer";
	}
	
	@RequestMapping(value = "/docreate", method=RequestMethod.POST)
	public String doCreate(Model model, @Valid Offer offer, BindingResult result){
		
		if(result.hasErrors()){
			
			/*System.out.println("Form does not validate.");
			List<ObjectError> errors = result.getAllErrors();
			
			for(ObjectError error: errors){
				System.out.println(error.getDefaultMessage());
			}*/
		
			return "createoffer";
		}
		
		offersService.create(offer);
		
		
		
		/*model.addAttribute("name", offer.getName());
		model.addAttribute("email", offer.getEmail());
		model.addAttribute("text", offer.getText());
		*/	
		
		return "offercreated";
	}
	
}
