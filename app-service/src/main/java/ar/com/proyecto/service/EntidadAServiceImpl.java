package ar.com.proyecto.service;

import ar.com.proyecto.EntidadA;
import ar.com.proyecto.repository.EntidadARepositoryImpl;

public class EntidadAServiceImpl extends AbstractEntidadBaseService <EntidadA> implements EntidadAService {
	
	public EntidadAServiceImpl() {
		super(new EntidadARepositoryImpl());
	}

}
