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
				String nmAlimentos = rs.getString("NM_ALIMENTO");
				Double nrCaloriasAlimetos = rs.getDouble("NR_CALORIAS_ALIMENTO");
				Date hrConsumo = rs.getDate("HR_CONSUMO_ALIMENTO");
				
				Calendar data = Calendar.getInstance();
				
				data.setTimeInMillis(hrConsumo.getTime());
				
				Alimento alimento = new Alimento(idAlimento,nmAlimentos,nrCaloriasAlimetos,data,idUsuario);
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
		
		
		System.out.println("ID_ALIMENTO\tT_USUARIO_ID_USUARIO\tNM_ALIMENTOS\tNR_CALORIAS_ALIMENTOS\tHR_CONSUMO");
		
		for(Alimento registro:listaAlimentos) {
			System.out.println(registro);
		}
		
	}
	
	
	@Override
	public void insert(String nomeAlimento, Double caloriasAlimento, Calendar horaConsumo, Long idUsuario) {
		
		PreparedStatement stmt= null;
		Alimento alimento = new Alimento(nomeAlimento, caloriasAlimento, horaConsumo, idUsuario);
		
		try {
			conexao= DBManager.obterConexao();
			
			String sql = "INSERT INTO T_ALIMENTO (ID_ALIMENTO,T_USUARIO_ID_USUARIO,\r\n"
					+ "NM_ALIMENTO, NR_CALORIAS_ALIMENTO, HR_CONSUMO_ALIMENTO) \r\n"
					+ "VALUES (ALIMENTO_SEQ.NEXTVAL,?,?,?,?)";
			stmt= conexao.prepareStatement(sql);
			stmt.setLong(1, alimento.getIdUsuario());
			stmt.setString(2, alimento.getNomeAlimento());
			stmt.setDouble(3, alimento.getCaloriasAlimento());
			Date data = new Date(alimento.getHoraConsumo().getTimeInMillis());
			stmt.setDate(4, data);
						
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

	

