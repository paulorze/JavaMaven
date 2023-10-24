package ar.com.proyecto.repository;

import java.util.Collection;

import ar.com.proyecto.EntidadA;

public class EntidadARepositoryImpl extends BaseCrud<EntidadA> implements EntidadARepository {

	public EntidadARepositoryImpl() {
		super(EntidadA.class, "tablaa");
	}
	
	

}
