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
import br.com.healthTrack.entities.Atividade;
import br.com.healthTrack.interfaces.InterfaceAtividade;

public class AtividadeDAO implements InterfaceAtividade{
	
	private Connection conexao;

	@Override
	public void getAll() {
		List<Atividade> listaAtividades = new ArrayList<Atividade>();
		PreparedStatement stmt= null;
		ResultSet rs= null;
		
		try {
			conexao= DBManager.obterConexao();
			stmt= conexao.prepareStatement("SELECT * FROM T_ATIVIDADE");
			rs= stmt.executeQuery();
			
			while(rs.next()) {
				Long idAtividade = rs.getLong("ID_ATIVIDADE");
				Long idUsuario = rs.getLong("T_USUARIO_ID_USUARIO");
				Long idExercicio = rs.getLong("T_EXERCICIO_ID_EXERCICIO");
				Date dateAtividade = rs.getDate("DT_ATIVIDADE");
				
				Calendar data = Calendar.getInstance();
				
				data.setTimeInMillis(dateAtividade.getTime());
				
				Atividade atividade = new Atividade(idAtividade,idUsuario,idExercicio,data);
				listaAtividades.add(atividade);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
		
		System.out.println("ID_ATIVIDADE\tID_USUARIO\tID_EXERCICIO\tDATA_ATIVIDADE");
		
		for(Atividade registro:listaAtividades) {
			System.out.println(registro);
		}
		
	}

	@Override
	public void insert(Long idUsuario, Long idExercicio, Calendar dataAtividade) {
		
		PreparedStatement stmt= null;
		Atividade atividade = new Atividade(idUsuario,idExercicio,dataAtividade);
		
		try {
			conexao= DBManager.obterConexao();
			
			String sql = "INSERT INTO T_ATIVIDADE (ID_ATIVIDADE,T_USUARIO_ID_USUARIO,\r\n"
					+ "T_EXERCICIO_ID_EXERCICIO,DT_ATIVIDADE) \r\n"
					+ "VALUES (ATIVIDADE_SEQ.NEXTVAL,?,?,?)";
			
			stmt= conexao.prepareStatement(sql);
			stmt.setLong(1, atividade.getIdUsuario());
			stmt.setLong(2, atividade.getIdExercicio());
			
			Date data = new Date(atividade.getDataAtividade().getTimeInMillis());
			
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
