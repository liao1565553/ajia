package com.ajia.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.ajia.dto.Customer;
import com.ajia.mapper.CustomerMapper;
import com.ajia.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService {
	@Resource
	private CustomerMapper customerMapper;

	
	public Customer getLastCustomer() {
		return customerMapper.getLastCustomer();
	}
	

}
