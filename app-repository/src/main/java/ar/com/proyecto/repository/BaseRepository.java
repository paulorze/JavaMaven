package ar.com.proyecto.repository;

import java.util.Collection;

public interface BaseRepository<T> {
	public void save (T entidad);
	
	public void delete (String entidad );
	
	public void update (T entidad);
	
	public T getById (String entidad);
	
	public Collection<T> findAll();
}
