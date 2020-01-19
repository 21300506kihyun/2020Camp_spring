package com.controllerparam.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.controllerparam.user.UserVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	 
	    @RequestMapping("/hello")
	    public ModelAndView hello(@RequestParam("a") String a,
	    // required 조건이 없으	면 기본값은 true, 즉 필수 파라미터이다. 파라미터 pageNo가 존재하지 않으면 Exception 발생.		      
			      @RequestParam(value="b", required=false) String b) {
			System.out.println("a : " + a);
			System.out.println("b : " + b);
	    // 파라미터 pageNo가 존재하지 않으면 String pageNo는 null.
			ModelAndView mv = new ModelAndView(); 
			mv.setViewName("home"); 
			mv.addObject("a", a);
			mv.addObject("b", b);
			
	    	return mv;
	    
	    }
	    
	    @RequestMapping("/header")
	    public ModelAndView hello(@RequestHeader("Accept-Language") String languageHeader) {
			System.out.println(languageHeader);

			ModelAndView mv = new ModelAndView(); 
			mv.setViewName("home"); 
			mv.addObject("a",languageHeader);

			
	    	return mv;
	    
	    }
	    
	    @RequestMapping("/http")
	    public ModelAndView hello(HttpServletRequest request) {
			String a = request.getParameter("a");
			String b = request.getParameter("b");
			
			System.out.println("a : " + a);
			System.out.println("b : " + b);

			ModelAndView mv = new ModelAndView(); 
			mv.setViewName("home"); 
			mv.addObject("a",a);
			mv.addObject("b",b);

			
	    	return mv;
	    
	    }

	    
	    @RequestMapping("/temp/{a}/{b}")
		String temp(@PathVariable("a") String a, @PathVariable("b") int b)
		{
			System.out.println(a);
			System.out.println(b);
			return "home";
		}
}
	

