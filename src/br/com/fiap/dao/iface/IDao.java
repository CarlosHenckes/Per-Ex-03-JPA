package br.com.fiap.dao.iface;

import java.util.List;

/**
 * Interface com metodos de grud
 * @author Henckes
 *
 * @param <T>
 */
public interface IDao<T> {
	void insert(T entity) throws Exception;
	void update(T entity) throws Exception;
	void delete(T entity) throws Exception;
	List<T> listAll();
	T findById(int id);
}
