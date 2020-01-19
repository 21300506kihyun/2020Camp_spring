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
	    // required ������ ����	�� �⺻���� true, �� �ʼ� �Ķ�����̴�. �Ķ���� pageNo�� �������� ������ Exception �߻�.		      
			      @RequestParam(value="b", required=false) String b) {
			System.out.println("a : " + a);
			System.out.println("b : " + b);
	    // �Ķ���� pageNo�� �������� ������ String pageNo�� null.
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
	

