package com.icarus.controller;

import com.icarus.model.po.Customer;
import com.icarus.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /**
     * 根据 id 查询客户信息
     */
    @GetMapping("/find")
    public String findCustomerById(Integer id, Model model) {
        Customer customer = customerService.findCustomerById(id);
        model.addAttribute("customer", customer);
        // 返回客户信息展示页面
        return "customer";
    }

}
