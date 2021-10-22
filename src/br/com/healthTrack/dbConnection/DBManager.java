package br.com.healthTrack.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	
	public static Connection obterConexao() {
		Connection conexao = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@docker_oracle-db_1:1522:ORCL","OPS$system","oracle");
			
		}catch(SQLException e) {
			System.err.println("Nãofoi possível conectar no Banco deDados");
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			System.err.println("O Driver JDBC não foi encontrado!");
			e.printStackTrace();
		}
		System.out.println("Conectado!");
		return conexao;
	}

}
