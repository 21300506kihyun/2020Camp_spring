package com.returntype.ex01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
@RequestMapping("/ex01")
public class SampleController2 {
    
    private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
    
    @RequestMapping("/doC")
    public String doC(@ModelAttribute("msg") String msg){
        
        logger.info("doC 실행..........");
        
        System.out.println("doC 메시지 : "+msg);
        
        return "result";  // 문자열이 사용될 경우 문자열.jsp 파일을 찾아서 실행한다.
    }
    
    /*
     * @ModelAttribute("msg") 는 주소창에 msg라는 파라미터 값을 가져온다.
     * 주소창 : http://localhost:8080/ex01/doC?msg=aa
     * 이렇게 되어있을경우 자동적으로 msg의 값인 aa를 가져온다.
     */
}
