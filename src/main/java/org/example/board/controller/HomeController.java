package org.example.board.controller;

import org.example.board.dao.CustomerDao;
import org.example.board.vo.CustomerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    private CustomerDao dao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        CustomerVo c = dao.selectByName("kim");
        System.out.println(c.getAge());
        return "home";
    }
}
