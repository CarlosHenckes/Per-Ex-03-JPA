package br.com.fiap.test;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Cliente;

/**
 * Classe teste que busca um cliente por seu id
 * @author Henckes
 *
 */
public class EncontrarCliente {

	public static void main(String[] args) {
		
		// encontrar um cliente pelo id
		GenericDao<Cliente> dao = new GenericDao<Cliente>(Cliente.class);
		System.out.println(dao.findById(1));
	}

}
