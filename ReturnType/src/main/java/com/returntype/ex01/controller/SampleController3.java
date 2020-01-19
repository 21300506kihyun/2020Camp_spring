package com.returntype.ex01.controller;

import java.util.HashMap;
import java.util.Map;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
import com.returntype.ex01.vo.MemberVO;
 
@Controller
@RequestMapping("/ex01")
public class SampleController3 {
    
    private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
    
    @RequestMapping("/doD")
    public String doD(Model model){
        
        logger.info("doD 실행...........");
        
        MemberVO member = new MemberVO();
        member.setUserid("userid-01");
        member.setUserpw("userpw-01");
        
        model.addAttribute("member", member);
        //model.addAttribute(member);
        
        logger.info("MemberVO : "+member.toString());
        
        return "ex01/data";  
    }
    
    @RequestMapping("/doE")
    public String doE(Model model){
        
        logger.info("doE 실행...........");
        
        Map<String,String> map = new HashMap<String,String>();
        map.put("userid", "userid-02");
        map.put("userpw", "userpw-02");
        
        model.addAttribute("map", map);
    
        return "ex01/data";  
    }
}
