package com.myCode.controller;


import com.myCode.domain.User;
import com.myCode.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService service ;

    @RequestMapping("/test.do")
    @ResponseBody
    public List<User> do1(){
        return service.selectAllUser();
    }
}
