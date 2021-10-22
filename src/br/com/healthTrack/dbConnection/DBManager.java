package br.com.healthTrack.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	
	public static Connection obterConexao() {
		Connection conexao = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","system","oracle");
			
		}catch(SQLException e) {
			System.err.println("Não foi possível conectar no Banco deDados");
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			System.err.println("O Driver JDBC não foi encontrado!");
			e.printStackTrace();
		}
		return conexao;
	}

}
