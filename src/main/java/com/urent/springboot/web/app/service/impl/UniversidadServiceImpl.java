package com.urent.springboot.web.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.urent.springboot.web.app.commons.GenericServiceImpl;
import com.urent.springboot.web.app.dao.api.UniversidadDaoAPI;
import com.urent.springboot.web.app.model.Universidad;
import com.urent.springboot.web.app.service.api.UniversidadServiceAPI;

@Service
public class UniversidadServiceImpl extends GenericServiceImpl<Universidad, Integer> implements UniversidadServiceAPI{
	
	@Autowired
	private UniversidadDaoAPI universidadDaoAPI;
	@Override
	public CrudRepository<Universidad, Integer> getDao() {
		// TODO Auto-generated method stub
		return universidadDaoAPI;
	}
	

}
