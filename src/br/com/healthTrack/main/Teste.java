package br.com.healthTrack.main;

import java.util.Calendar;
import java.util.Scanner;

import br.com.healthTrack.entities.dao.AtividadeDAO;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		
		do {
			System.out.println("O que deseja fazer?");
			System.out.println();
			System.out.println();
			System.out.println("INSTRUÇÕES:");
			System.out.println();
			System.out.println("Digite 1 para fazer 5 registros de atividade");
			System.out.println("Digite 2 para visualizar registros de atividade");
			System.out.println("Digite 3 para sair");
			System.out.println();
			System.out.print(">>> ");
			
			
			switch(sc.next()) {
			
				case "1":{
					AtividadeDAO atividadeDAO = new  AtividadeDAO();
					atividadeDAO.insert(2l, 1l, Calendar.getInstance());
					atividadeDAO.insert(2l, 2l, Calendar.getInstance());
					atividadeDAO.insert(2l, 3l, Calendar.getInstance());
					atividadeDAO.insert(1l, 1l, Calendar.getInstance());
					atividadeDAO.insert(1l, 3l, Calendar.getInstance());
					break;
				}
				
				case "2":{
					AtividadeDAO atividadeDAO = new  AtividadeDAO();
					System.out.println("--------------------REGISTRO DE ATIVIDADE---------------------");
					atividadeDAO.getAll();
					System.out.println();
					break;
				}
				
				case "3":{
					loop = false;
				}
				default:{
					System.out.println("ERRO - COMANDO INCORRETO !!");
				}
			
			}
		}while(loop);
		
		sc.close();
		
		System.out.println("PROGRAMA FINALIZADO !!");

	}

}
