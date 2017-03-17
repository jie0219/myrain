package com.rain.code.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rain.code.dao.ICustomerDAO;
import com.rain.code.service.ICustomerService;
import com.rain.code.vo.CustomerModel;
import com.rain.code.vo.CustomerQueryModel;


@Service
@Transactional
public class CustomerServiceImpl extends BaseServiceImpl<CustomerModel,CustomerQueryModel> implements ICustomerService
{
	private ICustomerDAO customerDao;
	
	@Autowired
	public void setCustomerDao(ICustomerDAO customerDao) 
	{
		this.customerDao = customerDao;
		super.setDao(customerDao);
	}
	
}
