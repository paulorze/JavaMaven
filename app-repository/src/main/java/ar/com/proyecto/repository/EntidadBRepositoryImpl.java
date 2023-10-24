package ar.com.proyecto.repository;

import java.util.Collection;

import ar.com.proyecto.EntidadA;
import ar.com.proyecto.EntidadB;

public class EntidadBRepositoryImpl extends BaseCrud<EntidadB> implements EntidadBRepository {

	public EntidadBRepositoryImpl() {
		super(EntidadB.class, "tablab");
	}
	
	

}
