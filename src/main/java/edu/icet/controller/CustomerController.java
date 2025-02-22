package edu.icet.controller;

import edu.icet.dto.Customer;
import edu.icet.service.CustomerService;
import edu.icet.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService service;

    @PostMapping("/add")
    public void addCustomer(Customer customer){
        service.addCustomer(customer);

    }
}
