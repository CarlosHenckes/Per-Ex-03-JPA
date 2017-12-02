package br.com.fiap.test;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Cliente;

/**
 * Classe teste que lista todos os clientes cadastrados
 * @author Henckes
 *
 */
public class ListarClientes {

	public static void main(String[] args) {
		
		GenericDao<Cliente> dao = new GenericDao<Cliente>(Cliente.class);
		
		for (Cliente c : dao.listAll()) {
			System.out.println(c.toString());
		}
	}

}
