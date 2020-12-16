package com.sonata.two;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class MyController{
   
  
    @RequestMapping(method = RequestMethod.GET) 
    public String helloWorld(ModelMap modelMap){
 
        modelMap.addAttribute("message1", "Welcome to JPassion.com!");
        return "newpage";
    }
 
 
    @RequestMapping(value="/sayspringmvc", method = RequestMethod.GET)
    public ModelAndView helloWorld(){
 
        ModelAndView modelAndView = new ModelAndView("mypage3");
        modelAndView.addObject("message3", "Spring MVC!");
 
        return modelAndView;
   
}
    @RequestMapping(value="/helloString/{Morning}", method = RequestMethod.GET)
    public String helloURITemplate(@PathVariable String Morning, Model model){
 
        model.addAttribute("Good"+Morning, "Good"+Morning + " To Everyone!!");
        return "mypage"+Morning;
    }
   
}