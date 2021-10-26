package br.com.healthTrack.entities.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.healthTrack.dbConnection.DBManager;
import br.com.healthTrack.entities.Peso;
import br.com.healthTrack.interfaces.InterfacePeso;

public class PesoDAO implements InterfacePeso{

	private Connection conexao;
	
	@Override
	public void getAll() {
		List<Peso> listaPeso = new ArrayList<Peso>();
		PreparedStatement stmt= null;
		ResultSet rs= null;
		
		try {
			conexao= DBManager.obterConexao();
			stmt= conexao.prepareStatement("SELECT * FROM T_HIST_PESO");
			rs= stmt.executeQuery();
			
			while(rs.next()) {
				Long idPeso = rs.getLong("ID_HIST_PESO");
				Long idUsuario = rs.getLong("T_USUARIO_ID_USUARIO");
				Double valorPeso = rs.getDouble("NR_HIST_PESO");
				Date datePeso = rs.getDate("DT_REGISTRO_PESO");

				Peso peso = new Peso(idPeso,valorPeso,datePeso,idUsuario);
				listaPeso.add(peso);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				stmt.close();
				rs.close();
				conexao.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("ID_HIST_PESO\tT_USUARIO_ID_USUARIO\tNR_HIST_PESO\tDT_REGISTRO_PESO");
		
		for(Peso registro:listaPeso) {
			System.out.println(registro);
		}
	}

	@Override
	public void insert(Double valorPeso, Date registroPeso, Long idUsuario) {
		PreparedStatement stmt= null;
		Peso peso = new Peso(valorPeso,registroPeso,idUsuario);
		
		try {
			conexao= DBManager.obterConexao();
			
			String sql = "INSERT INTO T_HIST_PESO (ID_HIST_PESO,T_USUARIO_ID_USUARIO,\r\n"
					+ "NR_HIST_PESO,tDT_REGISTRO_PESO) \r\n"
					+ "VALUES (PESO_SEQ.NEXTVAL,?,?,?)";
			
			stmt= conexao.prepareStatement(sql);
			stmt.setLong(1, peso.getIdUsuario());
			stmt.setDouble(2, peso.getValorPeso());
				
			java.util.Date data = peso.getRegistroPeso();
			java.sql.Date dataSql = new java.sql.Date(data.getTime());

			stmt.setDate(3, dataSql);
			
			stmt.executeUpdate();	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				stmt.close();
				conexao.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
