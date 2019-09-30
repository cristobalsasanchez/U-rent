package com.urent.springboot.web.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.urent.springboot.web.app.commons.GenericServiceImpl;
import com.urent.springboot.web.app.dao.api.InmuebleDaoAPI;
import com.urent.springboot.web.app.model.Inmueble;
import com.urent.springboot.web.app.service.api.InmuebleServiceAPI;
@Service
public class InmuebleServiceImpl extends GenericServiceImpl<Inmueble, Integer> implements InmuebleServiceAPI{
	@Autowired
	private InmuebleDaoAPI inmuebleDaoAPI;
	@Override
	public CrudRepository<Inmueble, Integer> getDao() {
		// TODO Auto-generated method stub
		return inmuebleDaoAPI;
	}
	

}
