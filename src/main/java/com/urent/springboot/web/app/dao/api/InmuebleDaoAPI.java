package com.urent.springboot.web.app.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.urent.springboot.web.app.model.Inmueble;

public interface InmuebleDaoAPI extends CrudRepository<Inmueble, Integer> {

}
