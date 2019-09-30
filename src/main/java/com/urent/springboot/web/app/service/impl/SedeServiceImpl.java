package com.urent.springboot.web.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.urent.springboot.web.app.commons.GenericServiceImpl;
import com.urent.springboot.web.app.dao.api.SedeDaoAPI;
import com.urent.springboot.web.app.model.Sede;
import com.urent.springboot.web.app.service.api.SedeServiceAPI;

@Service
public class SedeServiceImpl extends GenericServiceImpl<Sede, Integer> implements SedeServiceAPI {
	@Autowired
	private SedeDaoAPI sedeDaoAPI;
	@Override
	public CrudRepository<Sede, Integer> getDao() {
		// TODO Auto-generated method stub
		return sedeDaoAPI;
	}

}
