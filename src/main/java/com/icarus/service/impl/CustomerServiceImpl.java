package com.icarus.service.impl;

import com.icarus.mapper.CustomerMapper;
import com.icarus.model.po.Customer;
import com.icarus.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    // 注解注入 CustomerMapper
    @Autowired
    private CustomerMapper customerMapper;

    // 根据 id 查询客户信息
    @Override
    public Customer findCustomerById(Integer id) {
        return this.customerMapper.findCustomerById(id);
    }

}
