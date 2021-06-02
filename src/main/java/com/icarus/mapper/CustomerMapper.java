package com.icarus.mapper;

import com.icarus.model.po.Customer;

public interface CustomerMapper {

    /**
     * 根据 id 查询客户信息
     * @param id 客户 id
     * @return 客户信息
     */
    public Customer findCustomerById(Integer id);

}
