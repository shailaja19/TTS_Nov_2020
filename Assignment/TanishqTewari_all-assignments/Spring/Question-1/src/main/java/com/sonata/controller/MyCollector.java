package com.sonata.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/helloworld")
public class MyCollector {
	  @RequestMapping(value ="/morning", method = RequestMethod.GET) 
	    public String helloWorld(ModelMap modelMap){
	 
	        modelMap.addAttribute("message1", "Good Morning!");
	        return "morning";
	    }
	    @RequestMapping(value="/afternoon", method = RequestMethod.GET)
	    public String helloWorld(Map map){
	 
	        map.put("message2", "Good Afternoon!");
	        return "after";
	    }
	 
	    @RequestMapping(value="/evening", method = RequestMethod.GET)
	    public ModelAndView helloWorld(){
	 
	        ModelAndView modelAndView = new ModelAndView("evening");
	        modelAndView.addObject("message3", "Good Evening!");
	 
	        return modelAndView;
	    }

	}