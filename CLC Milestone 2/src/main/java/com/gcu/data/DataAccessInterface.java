package com.gcu.data;

import java.util.List;

public interface DataAccessInterface<T> 
{
	public List<T> findAll();
	public T findbyId(long id);
	public boolean create(T t);
	public boolean update(T t);
	public boolean delete(T t);
    List<T> getProductsByCategory(String category);
}
