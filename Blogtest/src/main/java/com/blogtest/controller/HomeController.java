package com.blogtest.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.blogtest.dto.UserListResponseDTO;
import com.blogtest.service.UserListServiceImpl;


@Controller
public class HomeController {
	
	@Autowired
	UserListServiceImpl userListService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView mv) {
		
		List<UserListResponseDTO> userlist = userListService.getUserListService();
		
		for(int i =0; i <userlist.size(); i++) {
			System.out.println("name: " + userlist.get(i).getUserName());
		}
		
		mv.addObject("listuser", userlist);
		mv.setViewName("user");
		
		return mv;
	}
	
}
