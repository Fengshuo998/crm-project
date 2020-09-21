package com.myCode.controller;

import com.myCode.entity.Employee;
import com.myCode.services.empService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controllerTest {

    @Autowired
    private empService service = null;

    @RequestMapping("/test")
    public ModelAndView test1(String name){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.setViewName("test");
        return mv;
    }

    @RequestMapping("/selectOneById")
    @ResponseBody
    public Employee findOne(Integer id) {
        System.out.println(id);
        Employee employee = service.selectOneById(id);
        System.out.println(employee);
        return employee;
    }

}
