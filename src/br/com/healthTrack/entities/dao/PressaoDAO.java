package br.com.healthTrack.entities.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.healthTrack.dbConnection.DBManager;
import br.com.healthTrack.entities.Pressao;
import br.com.healthTrack.interfaces.InterfacePressao;

public class PressaoDAO implements InterfacePressao{

	private Connection conexao;

	@Override
	public void getAll() {
		List<Pressao> listaPressao = new ArrayList<Pressao>();
		PreparedStatement stmt= null;
		ResultSet rs= null;
		
		try {
			conexao= DBManager.obterConexao();
			stmt= conexao.prepareStatement("SELECT * FROM T_HIST_PRESSAO");
			rs= stmt.executeQuery();
			
			while(rs.next()) {
				Long idPressao = rs.getLong("ID_HIST_PRESSAO");
				Long idUsuario = rs.getLong("T_USUARIO_ID_USUARIO");
				Double valorPressao = rs.getDouble("NT_VALOR_PRESSAO");
				Date datePressao = rs.getDate("DT_REGISTRO_PRESSAO");
				
				Calendar data = Calendar.getInstance();
				
				data.setTimeInMillis(datePressao.getTime());
				
				Pressao pressao = new Pressao(idPressao,valorPressao,data,idUsuario);
				listaPressao.add(pressao);
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
		
		System.out.println("ID_HIST_PRESSAO\tT_USUARIO_ID_USUARIO\tNT_VALOR_PRESSAO\tDT_REGISTRO_PRESSAO");
		
		for(Pressao registro:listaPressao) {
			System.out.println(registro);
		}
		
	}

	@Override
	public void insert(Double valorPressao,Calendar registroPressao,Long idUsuario) {
		
		PreparedStatement stmt= null;
		Pressao pressao = new Pressao(valorPressao,registroPressao,idUsuario);
		
		try {
			conexao= DBManager.obterConexao();
			
			String sql = "INSERT INTO T_HIST_PRESSAO (ID_HIST_PRESSAO,T_USUARIO_ID_USUARIO,\r\n"
					+ "T_HIST_PRESSAO,DT_REGISTRO_PRESSAO) \r\n"
					+ "VALUES (PRESSAO_SEQ.NEXTVAL,?,?,?)";
			
			stmt= conexao.prepareStatement(sql);
			stmt.setLong(1, pressao.getIdUsuario());
			stmt.setDouble(2, pressao.getValorPressao());
			
			Date data = new Date(pressao.getRegistroPressao().getTimeInMillis());
			
			stmt.setDate(3, data);
			
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
