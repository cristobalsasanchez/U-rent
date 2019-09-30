package com.urent.springboot.web.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.urent.springboot.web.app.commons.GenericServiceImpl;
import com.urent.springboot.web.app.dao.api.ArrendatarioDaoAPI;
import com.urent.springboot.web.app.model.Arrendatario;
import com.urent.springboot.web.app.service.api.ArrendatarioServiceAPI;

@Service
public class ArrendatarioServiceImpl extends GenericServiceImpl<Arrendatario, String> implements ArrendatarioServiceAPI{
	@Autowired
	private ArrendatarioDaoAPI arrendatarioDaoAPI;
	@Override
	public CrudRepository<Arrendatario, String> getDao() {

		return arrendatarioDaoAPI;
	}

}
