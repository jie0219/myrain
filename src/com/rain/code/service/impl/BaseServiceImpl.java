package com.rain.code.service.impl;

import java.util.List;

import com.rain.code.dao.BaseDAO;
import com.rain.code.service.IBaseService;
import com.rain.code.util.Page;
import com.rain.code.vo.BaseModel;

public class BaseServiceImpl<M,QM extends BaseModel> implements IBaseService<M,QM>
{

	private BaseDAO dao = null;
	
	public void setDao(BaseDAO dao) 
	{
		this.dao = dao;
	}

	
	@Override
	public void create(M m) {
		dao.create(m);
	}

	@Override
	public void update(M m) {
		dao.update(m);
	}

	@Override
	public void delete(int uuid) {
		dao.delete(uuid);
	}

	@Override
	public M getByUuid(int uuid) {
		
		return (M) dao.getByUuid(uuid);
	}

	@Override
	public Page<M> getByConditionPage(QM qm) 
	{
		List<M> result = dao.getByConditionPage(qm);
		
		qm.getPage().setResult(result);
		
		return qm.getPage();
	}

}
