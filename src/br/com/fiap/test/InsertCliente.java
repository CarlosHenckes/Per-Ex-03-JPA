package br.com.fiap.test;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Cliente;

/**
 * Classe teste que persiste um novo cliente
 * @author Henckes
 *
 */
public class InsertCliente {

	public static void main(String[] args) {
		
		// persists a new CLiente
		GenericDao<Cliente> dao = new GenericDao<Cliente>(Cliente.class);
		try {
			dao.insert(new Cliente("Jose Coltro","jose@femorale.com"));
			System.out.println("Novo Cliente persistido.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
