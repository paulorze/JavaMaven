package ar.com.proyecto.service;

import java.util.Collection;


public interface EntidadBaseService<T> {
	public Collection<T> buscarTodos();
}
