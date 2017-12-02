package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.iface.IDao;
import br.com.fiap.util.JPAUtil;
/**
 * Classe generica com grud completo que implementa IDao
 * @author Henckes
 * @see IDao
 * @param <T>
 */
public class GenericDao<T> implements IDao<T> {

	private final Class<T> classe;
	protected EntityManager em;
	
	public GenericDao(Class<T> classe) {
		this.classe = classe;
	}
	
	@Override
	public void insert(T entity) throws Exception {
		em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void update(T entity) throws Exception {
		em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void delete(T entity) throws Exception {
		em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(entity));
		em.getTransaction().commit();
		em.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> listAll() {
		em = JPAUtil.getEntityManager();
		return em.createQuery("from "+ classe.getSimpleName() +" c").getResultList();
	}

	@Override
	public T findById(int id) {
		em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		T entity = em.find(classe, id);
		em.getTransaction().commit();
		return entity;
	}

}
