package br.com.fiap.test;

import java.util.Date;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pedido;

/**
 * Classe teste que persiste um novo pedido e um novo cliente
 * @author Henckes
 *
 */
public class InserirPedido {

	public static void main(String[] args) {
		
		// inserir um novo pedido e cliente
		GenericDao<Pedido> dao = new GenericDao<Pedido>(Pedido.class);
		Pedido pedido = new Pedido();
		pedido.setDescricao("Liquidificador Wallita");
		pedido.setValor(139.90d);
		pedido.setData(new Date());
		pedido.setCliente(new Cliente("Maria Jose","mjose@terra.com.br"));
		try {
			dao.insert(pedido);
			System.out.println("novo pedido criado");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
