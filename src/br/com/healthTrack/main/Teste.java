package br.com.healthTrack.main;

import java.sql.Connection;

import br.com.healthTrack.dbConnection.DBManager;

public class Teste {

	public static void main(String[] args) {
		
		Connection connection = DBManager.obterConexao();
		
		
		System.out.println(connection);

	}

}
