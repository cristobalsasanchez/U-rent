package com.urent.springboot.web.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.urent.springboot.web.app.commons.GenericServiceImpl;
import com.urent.springboot.web.app.dao.api.PropiedadDaoAPI;
import com.urent.springboot.web.app.model.Propiedad;
import com.urent.springboot.web.app.service.api.PropiedadServiceAPI;

@Service
public class PropiedadServiceImpl extends GenericServiceImpl<Propiedad, Integer> implements PropiedadServiceAPI{
	@Autowired
	private PropiedadDaoAPI propiedadDaoAPI;
	@Override
	public CrudRepository<Propiedad, Integer> getDao() {
		// TODO Auto-generated method stub
		return propiedadDaoAPI;
	}
	

}
