package com.rain.code.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rain.code.vo.CustomerModel;
import com.rain.code.vo.CustomerQueryModel;

@Repository
public interface ICustomerDAO extends BaseDAO<CustomerModel,CustomerQueryModel>
{
/*	public void create(CustomerModel cm);
	public void delte(int uuid);
	public void update(CustomerModel cm);
	
	public CustomerModel getByUuid(int uuid);
	public List<CustomerModel> getByCondition(CustomerQueryModel cqm);
	public List<CustomerModel> getByConditionPage(CustomerQueryModel cqm);*/

}