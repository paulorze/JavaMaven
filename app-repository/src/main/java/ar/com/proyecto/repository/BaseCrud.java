package ar.com.proyecto.repository;

import java.util.Collection;

public abstract class BaseCrud<T> implements BaseRepository<T> {

	private Class type;
	private String table;
	
	public BaseCrud(Class type, String table) {
		this.type = type;
		this.table = table;
	}
	
	@Override
	public void save(T entidad) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String entidad) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(T entidad) {
		// TODO Auto-generated method stub

	}

	@Override
	public T getById(String entidad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
