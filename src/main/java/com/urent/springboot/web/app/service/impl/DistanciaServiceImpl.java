package com.urent.springboot.web.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.urent.springboot.web.app.commons.GenericServiceImpl;
import com.urent.springboot.web.app.dao.api.DistanciaDaoAPI;
import com.urent.springboot.web.app.model.Distancia;
import com.urent.springboot.web.app.service.api.DistanciaServiceAPI;
@Service
public class DistanciaServiceImpl extends GenericServiceImpl<Distancia, Integer> implements DistanciaServiceAPI{
	@Autowired
	private DistanciaDaoAPI distanciaDaoAPI;
	@Override
	public CrudRepository<Distancia, Integer> getDao() {
		// TODO Auto-generated method stub
		return distanciaDaoAPI;
	}
	
	

}
