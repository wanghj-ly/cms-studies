package com.briup.cms.web;

import com.briup.cms.bean.Customer;
import com.briup.cms.service.ICustomerService;
import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(description = "客户相关接口")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;


    @GetMapping("/queryById")
   @ApiOperation("根据客户查询")
    @ApiImplicitParam(name = "id",value = "客户id",paramType = "query",dataType = "int")
    public Customer queryById(int id) {

        return customerService.findById(id);
    }
    @GetMapping("/queryH")
    @ApiOperation("测试两个对象")
    public String queryH(int id,String name) {
        return "c";
    }
    @GetMapping("/queryQ")
    @ApiOperation("测试一个对象" )
    public Customer queryQ(Customer customer) {
        return customer;
    }

}
