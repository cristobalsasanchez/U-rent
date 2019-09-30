package com.urent.springboot.web.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.urent.springboot.web.app.commons.GenericServiceImpl;
import com.urent.springboot.web.app.dao.api.ArrendadorDaoAPI;
import com.urent.springboot.web.app.model.Arrendador;
import com.urent.springboot.web.app.service.api.ArrendadorServiceAPI;
@Service
public class ArrendadorServiceImpl extends GenericServiceImpl<Arrendador,String> implements ArrendadorServiceAPI{
	@Autowired
	private ArrendadorDaoAPI arrendadorDaoAPI;
	@Override
	public CrudRepository<Arrendador, String> getDao() {
		// TODO Auto-generated method stub
		return arrendadorDaoAPI;
	}

}
