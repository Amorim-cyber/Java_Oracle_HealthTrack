package br.com.healthTrack.main;

import java.time.LocalDate;

import br.com.healthTrack.entities.dao.AtividadeDAO;

public class Teste {

	public static void main(String[] args) {
		
		LocalDate todayLocalDate = LocalDate.now( );
		
		System.out.println("--------------------REGISTRO DE ATIVIDADE---------------------");
		
		AtividadeDAO atividadeDAO = new  AtividadeDAO();
		
		atividadeDAO.insert(2l, 1l, java.sql.Date.valueOf( todayLocalDate ));
		atividadeDAO.insert(2l, 2l, java.sql.Date.valueOf( todayLocalDate ));
		atividadeDAO.insert(2l, 3l, java.sql.Date.valueOf( todayLocalDate ));
		atividadeDAO.insert(1l, 1l, java.sql.Date.valueOf( todayLocalDate ));
		atividadeDAO.insert(1l, 3l, java.sql.Date.valueOf( todayLocalDate ));
		
		atividadeDAO.getAll();

	}

}
