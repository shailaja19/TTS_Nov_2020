package com.jpassion.mvc.controllers;

import java.util.List;
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
public class MyController{
   
  
    @RequestMapping(method = RequestMethod.GET) 
    public String helloWorld(ModelMap modelMap){
 
        modelMap.addAttribute("message1", "Welcome to JPassion.com!");
        return "mypage1";
    }
    
    @RequestMapping(value="/sayspring", method = RequestMethod.GET)
    public String helloWorld(Map map){
 
        map.put("message2", "Spring!");
        return "mypage2";
    }
 
    @RequestMapping(value="/sayspringmvc", method = RequestMethod.GET)
    public ModelAndView helloWorld(){
 
        ModelAndView modelAndView = new ModelAndView("mypage3");
        modelAndView.addObject("message3", "Spring MVC!");
 
        return modelAndView;
    }
    
//    @RequestMapping(value="/sayspringmvcdata", method = RequestMethod.GET) 
//    public ModelAndView helloWorld(List list){
//    	//list.add(index, ');
//        ModelAndView modelAndView = new ModelAndView("mypage4");
//        modelAndView.addObject("message4", "Spring MVC DATA!");
//        return modelAndView;
//    }
    @RequestMapping(value="/saykitchen", method=RequestMethod.GET)
    public String sayKitchen(ModelMap modelMap) {
        //logger.info("Welcome to my kitchen!");
        modelMap.addAttribute("color", "Blue");
        modelMap.addAttribute("size", 1000);
        return "kitchen";
           
    }
    
    // Handle URI template, receive it as a String type
    @RequestMapping(value="/helloString/{helloId}", method = RequestMethod.GET)
    public String helloURITemplate(@PathVariable String helloId, Model model){
 
        model.addAttribute("message"+helloId, "message"+helloId + " is selected!");
        return "mypage"+helloId;
    }
   
    // Handle URI template, receive it as a int type
    @RequestMapping(value="/helloint/{helloId}", method = RequestMethod.GET)
    public String helloURITemplate2(@PathVariable int helloId, Model model){
        model.addAttribute("message"+helloId, "message"+helloId + " is selected!");
        return "mypage"+helloId;
    
    }
    // Handle URI template, receive it as a String type
//    @RequestMapping(value="/helloString/{helloId}/{greeting}", method = RequestMethod.GET)
//    public String helloURITemplate3(@PathVariable String helloId,String greeting, Model model){
// 
//        model.addAttribute("message"+helloId, "message"+helloId + " is selected!" +"greeting");
//        return "mypage"+helloId;
//    }
   
    
}
