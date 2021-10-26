package br.com.healthTrack.entities.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.healthTrack.dbConnection.DBManager;
import br.com.healthTrack.entities.Exercicio;
import br.com.healthTrack.interfaces.InterfaceExercicio;

public class ExercicioDAO implements InterfaceExercicio{
	
	private Connection conexao;

	@Override
	public void getAll() {
		List<Exercicio> listaExercicios = new ArrayList<Exercicio>();
		PreparedStatement stmt= null;
		ResultSet rs= null;
		
		try {
			conexao= DBManager.obterConexao();
			stmt= conexao.prepareStatement("SELECT * FROM T_EXERCICIO");
			rs= stmt.executeQuery();
			
			while(rs.next()) {
				Long idExercicio = rs.getLong("ID_EXERCICIO");
				String nmExercicio = rs.getString("NM_EXERCICIO");
				Integer nrSetsExercicio = rs.getInt("NR_SETS_EXERCICIO");
				Integer nrRepeticaoExercicio = rs.getInt("NR_REPETICAO_EXERCICIO");
				
				Exercicio exercicio = new Exercicio(idExercicio,nmExercicio,nrSetsExercicio,nrRepeticaoExercicio);
				listaExercicios.add(exercicio);
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
		
		System.out.println("ID\tNOME\t\t\t\tNUM_SETS\tNUM_REPETICAO");
		
		for(Exercicio registro:listaExercicios) {
			System.out.println(registro);
		}
		
		
	}
	
	
	@Override
	public void insert(String nmExercicio, Integer nrSetsExercicio, Integer nrRepeticaoExercicio) {
		
		PreparedStatement stmt= null;
		Exercicio exercicio = new Exercicio(nmExercicio, nrSetsExercicio, nrRepeticaoExercicio);
		
		try {
			conexao= DBManager.obterConexao();
			
			String sql = "INSERT INTO T_EXERCICIO (ID_EXERCICIO,\r\n"
					+ "NM_EXERCICIO, NR_SETS_EXERCICIO, NR_REPETICAO_EXERCICIO) \r\n"
					+ "VALUES (EXERCICIO_SEQ.NEXTVAL,?,?,?)";
			
			stmt= conexao.prepareStatement(sql);
			stmt.setString(1, exercicio.getNomeExercicio());
			stmt.setInt(2, exercicio.getSetsExercicio());
			stmt.setInt(3, exercicio.getRepeticaoExercicio());
						
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				stmt.close();conexao.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
