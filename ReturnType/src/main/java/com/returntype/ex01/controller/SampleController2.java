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
        
        logger.info("doC ����..........");
        
        System.out.println("doC �޽��� : "+msg);
        
        return "result";  // ���ڿ��� ���� ��� ���ڿ�.jsp ������ ã�Ƽ� �����Ѵ�.
    }
    
    /*
     * @ModelAttribute("msg") �� �ּ�â�� msg��� �Ķ���� ���� �����´�.
     * �ּ�â : http://localhost:8080/ex01/doC?msg=aa
     * �̷��� �Ǿ�������� �ڵ������� msg�� ���� aa�� �����´�.
     */
}
