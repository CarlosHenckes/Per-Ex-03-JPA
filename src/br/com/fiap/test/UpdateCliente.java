package br.com.fiap.test;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Cliente;

/**
 * Classe teste que atualiza os dados de um cliente
 * @author Henckes
 *
 */
public class UpdateCliente {

	public static void main(String[] args) {
		
		// update cliente, change email
		GenericDao<Cliente>  dao = new GenericDao<Cliente>(Cliente.class);
		try {
			dao.update(new Cliente(1, "Carlos Henckes", "chenckes@uol.com.br"));
			System.out.println("Informacoes do cliente atualizadas");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
