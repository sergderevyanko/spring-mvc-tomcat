package org.udemy.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.udemy.learning.dao.CustomerDAO;

@Controller
@RequestMapping("/customer/")
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;

    @RequestMapping("/list")
    public String allCustomers(Model model){
        model.addAttribute("customers", customerDAO.getCustomers());
        return "customer/list";
    }

}
