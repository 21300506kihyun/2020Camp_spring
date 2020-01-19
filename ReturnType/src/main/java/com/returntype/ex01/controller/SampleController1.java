package com.returntype.ex01.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
@RequestMapping("/ex01")
public class SampleController1 
{
    private static final Logger logger = LoggerFactory.getLogger(SampleController1.class);
    
    @RequestMapping("/doA")
    public void doA(){
        logger.info("doA 실행..........");
    }
    
    @RequestMapping("/doB")
    public void doB(){
        logger.info("doB 실행..........");
    }
    
    // void 타입일 경우 접근하는 URL 경로에 해당하는 jsp를 찾아 실행한다.
    // 예를 들어 /ex01/doB로 접근했다면 ex01 폴더 아래 doB.jsp를 찾아 실행시킨다.
    
}
