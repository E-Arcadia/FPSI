package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entidades.Cliente;
import conexao.CNXHSQLDB;


public class ClienteDAO {
	private final String INSERIR_CLIENTE = "INSERT INTO CLIENTE ("
			+ "NOME, EMAIL, FONE, CARTAOCREDITO)" + 
			"VALUES (?, ?, ?, ?)";
	private final String SELECIONA_CLIENTE = "SELECT *FROM CLIENTE";
	
	
	private PreparedStatement pst = null;

	public void inserirCliente(Cliente umCliente) {
		try (	Connection conn = new CNXHSQLDB().conectar(); 
				PreparedStatement pst = conn.prepareStatement(INSERIR_CLIENTE);) {
			pst.setString(1, umCliente.getNome());
			pst.setString(2, umCliente.getEmail());
			pst.setString(3, umCliente.getFone());
			pst.setString(4, umCliente.getCartaoCredito());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao executar o Statment " + e.toString());
		}
	}
	
	
	public ArrayList<Cliente> listarTodosClientes() {
		ArrayList<Cliente> listaDeClientes = new ArrayList<>();

		Cliente umCliente;
		try (	Connection conn = new CNXHSQLDB().conectar();
				PreparedStatement pst = conn.prepareStatement(SELECIONA_CLIENTE);
				ResultSet rs = pst.executeQuery();) {

			while (rs.next()) {
				umCliente = new Cliente();
				umCliente.setID(rs.getInt("ID"));
				umCliente.setNome(rs.getString("NOME"));
				umCliente.setEmail(rs.getString("EMAIL"));
				umCliente.setFone(rs.getString("FONE"));
				umCliente.setCartaoCredito(rs.getString("CARTAOCREDITO"));
				listaDeClientes.add(umCliente);
			}

		} catch (SQLException e) {
			System.out.println("Erro ao executar o Statement" + e.toString());
		}

		return listaDeClientes;
	}

}
