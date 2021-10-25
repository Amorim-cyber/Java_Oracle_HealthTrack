package br.com.healthTrack.main;

import java.util.Calendar;

import br.com.healthTrack.entities.dao.AtividadeDAO;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("--------------------REGISTRO DE ATIVIDADE---------------------");
		
		AtividadeDAO atividadeDAO = new  AtividadeDAO();
		
		atividadeDAO.insert(2l, 1l, Calendar.getInstance());
		atividadeDAO.insert(2l, 2l, Calendar.getInstance());
		atividadeDAO.insert(2l, 3l, Calendar.getInstance());
		atividadeDAO.insert(1l, 1l, Calendar.getInstance());
		atividadeDAO.insert(1l, 3l, Calendar.getInstance());
		
		atividadeDAO.getAll();

	}

}
