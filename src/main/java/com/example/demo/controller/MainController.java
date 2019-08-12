package com.example.demo.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.form.ContactForm;
import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;

@Controller
public class MainController {
	@Autowired
	private ContactRepository contactRepository;
	
    @RequestMapping("/")
    public String index() {
        return "home";
    }
    @GetMapping("/contact")
    public String contact(ContactForm contactForm) {
    	return("contact");
    }
    
    @PostMapping("/contact")
    public ModelAndView contactPost(@Valid ContactForm contactForm, BindingResult bindingResult ,Contact contact) {		
    	ModelAndView modelAndView = new ModelAndView("contact");
    	if (bindingResult.hasErrors()) {
    		modelAndView.addObject("error", "Something went wrong");
        } else {
        	contactRepository.save(contact);
        	modelAndView.addObject("message", "Thank you for contacting us !");
        }
        return modelAndView;
    }
    
    
    
}
