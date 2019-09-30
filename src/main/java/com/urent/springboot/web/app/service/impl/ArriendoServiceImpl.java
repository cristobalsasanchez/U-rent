package com.urent.springboot.web.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.urent.springboot.web.app.commons.GenericServiceImpl;
import com.urent.springboot.web.app.dao.api.ArriendoDaoAPI;
import com.urent.springboot.web.app.model.Arriendo;
import com.urent.springboot.web.app.service.api.ArriendoServiceAPI;

@Service
public class ArriendoServiceImpl extends GenericServiceImpl<Arriendo, Integer> implements ArriendoServiceAPI{
	@Autowired
	private ArriendoDaoAPI arriendoDaoAPI;
	@Override
	public CrudRepository<Arriendo, Integer> getDao() {
		// TODO Auto-generated method stub
		return arriendoDaoAPI;
	}
	
}
