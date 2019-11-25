package com.briup.cms.service.impl;

import com.briup.cms.bean.Customer;
import com.briup.cms.dao.ICustomerDao;
import com.briup.cms.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: cms-studies
 * @description:
 * @author: wangzh
 * @create: 2019-11-20 15:42
 **/
@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerDao customerDao;

    @Override
    public Customer findById(int id) {
        return customerDao.queryById(id);
    }
}
