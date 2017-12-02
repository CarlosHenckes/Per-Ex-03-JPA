package br.com.fiap.test;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Cliente;

/**
 * Classe teste que remove um cliente por seu id
 * @author Henckes
 *
 */
public class RemoveCliente {

	public static void main(String[] args) {
		// remove cliente
		GenericDao<Cliente> dao = new GenericDao<Cliente>(Cliente.class);
		try {
			dao.delete(dao.findById(2));
			System.out.println("Cliente removido");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
