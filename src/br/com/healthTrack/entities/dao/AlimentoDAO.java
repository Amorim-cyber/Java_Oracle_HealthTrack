package br.com.healthTrack.entities.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.healthTrack.dbConnection.DBManager;
import br.com.healthTrack.entities.Alimento;
import br.com.healthTrack.interfaces.InterfaceAlimento;

public class AlimentoDAO implements InterfaceAlimento{
	
	private Connection conexao;
	
	@Override
	public void getAll() {
		List<Alimento> listaAlimentos = new ArrayList<Alimento>();
		PreparedStatement stmt= null;
		ResultSet rs= null;
		
		try {
			conexao= DBManager.obterConexao();
			stmt= conexao.prepareStatement("SELECT * FROM T_ALIMENTO");
			rs= stmt.executeQuery();
			
			while(rs.next()) {
				Long idAlimento = rs.getLong("ID_ALIMENTO");
				Long idUsuario = rs.getLong("T_USUARIO_ID_USUARIO");
				String nmAlimentos = rs.getString("NM_ALIMENTOS");
				Double nrCaloriasAlimetos = rs.getDouble("NR_CALORIAS_ALIMENTOS");
				Date hrConsumo = rs.getDate("HR_CONSUMO");
				
				Alimento alimento = new Alimento(idAlimento,nmAlimentos,nrCaloriasAlimetos,hrConsumo,idUsuario);
				listaAlimentos.add(alimento);
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
	}
	
	
	@Override
	public void insert(String nomeAlimento, Double caloriasAlimento, Date horaConsumo, Long idUsuario) {
		
		PreparedStatement stmt= null;
		Alimento alimento = new Alimento(nomeAlimento, caloriasAlimento, horaConsumo, idUsuario);
		
		try {
			conexao= DBManager.obterConexao();
			
			String sql = "INSERT INTO T_ALIMENTO (ID_ALIMENTO,T_USUARIO_ID_USUARIO,\r\n"
					+ "NM_ALIMENTOS, NR_CALORIAS_ALIMENTOS, HR_CONSUMO) \r\n"
					+ "VALUES (ALIMENTO_SEQ.NEXTVAL,?,?,?)";
			
			stmt= conexao.prepareStatement(sql);
			stmt.setLong(1, alimento.getIdUsuario());
			stmt.setLong(2, alimento.getIdAlimento());
			stmt.setDate(3, alimento.getHoraConsumo());
						
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

	

