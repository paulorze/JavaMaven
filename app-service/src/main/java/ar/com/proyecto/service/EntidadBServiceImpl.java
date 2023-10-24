package ar.com.proyecto.service;

import ar.com.proyecto.EntidadB;
import ar.com.proyecto.repository.EntidadBRepositoryImpl;

public class EntidadBServiceImpl extends AbstractEntidadBaseService<EntidadB> implements EntidadBService {
	
	public EntidadBServiceImpl() {
		super(new EntidadBRepositoryImpl());
	}
	
}
