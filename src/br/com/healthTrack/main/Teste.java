package br.com.healthTrack.main;

import java.util.Calendar;
import java.util.Scanner;

import br.com.healthTrack.entities.dao.AlimentoDAO;
import br.com.healthTrack.entities.dao.AtividadeDAO;
import br.com.healthTrack.entities.dao.ExercicioDAO;
import br.com.healthTrack.entities.dao.PesoDAO;
import br.com.healthTrack.entities.dao.PressaoDAO;

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
			System.out.println("Digite 3 para fazer 5 registros de pressão");
			System.out.println("Digite 4 para visualizar registros de pressão");
			System.out.println("Digite 5 para fazer 5 registros de alimento");
			System.out.println("Digite 6 para visualizar registros de alimento");
			System.out.println("Digite 7 para fazer 5 registros de peso");
			System.out.println("Digite 8 para visualizar registros de peso");
			System.out.println("Digite 9 para fazer 5 registros de exercicio");
			System.out.println("Digite 10 para visualizar registros de exercicio");
			System.out.println("Digite 11 para sair");
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
					System.out.println("Linhas adicionadas com sucesso !!!");
					System.out.println();
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
					PressaoDAO pressaoDAO = new  PressaoDAO();
					pressaoDAO.insert(93D, Calendar.getInstance(), 2l);
					pressaoDAO.insert(162D, Calendar.getInstance(), 2l);
					pressaoDAO.insert(94D, Calendar.getInstance(), 2l);
					pressaoDAO.insert(109D, Calendar.getInstance(), 1l);
					pressaoDAO.insert(143D, Calendar.getInstance(), 1l);
					System.out.println("Linhas adicionadas com sucesso !!!");
					System.out.println();
					break;
				}
				
				case "4":{
					PressaoDAO pressaoDAO = new  PressaoDAO();
					System.out.println("--------------------REGISTRO DE PRESSÃO---------------------");
					pressaoDAO.getAll();
					System.out.println();
					break;
				}
				
				case "5":{
					AlimentoDAO alimentoDAO = new AlimentoDAO();
					alimentoDAO.insert("Yogurt Grego 100g",120D, Calendar.getInstance(), 3l);
					alimentoDAO.insert("Arroz e feijão 100g",151D, Calendar.getInstance(), 3l);
					alimentoDAO.insert("Sopa de ervilha 100g",61D, Calendar.getInstance(), 3l);
					alimentoDAO.insert("Sucrilhos 100g",369D, Calendar.getInstance(), 2l);
					alimentoDAO.insert("Salmão grelhado 100g",171D, Calendar.getInstance(), 2l);
					System.out.println("Linhas adicionadas com sucesso !!!");
					System.out.println();
					break;
				}
				
				case "6":{
					AlimentoDAO alimentoDAO = new AlimentoDAO();
					System.out.println("--------------------REGISTRO DE ALIMENTO---------------------");
					alimentoDAO.getAll();
					System.out.println();
					break;
				}
				
				case "7":{
					PesoDAO pesoDAO = new PesoDAO(); 
					pesoDAO.insert(75.5D, Calendar.getInstance(), 2l);
					pesoDAO.insert(73D, Calendar.getInstance(), 2l);
					pesoDAO.insert(70D, Calendar.getInstance(), 2l);
					pesoDAO.insert(100D, Calendar.getInstance(), 1l);
					pesoDAO.insert(99D, Calendar.getInstance(), 1l);
					System.out.println("Linhas adicionadas com sucesso !!!");
					System.out.println();
					break;
				}
				
				case "8":{
					PesoDAO pesoDAO = new PesoDAO();
					System.out.println("--------------------REGISTRO DE PESO---------------------");
					pesoDAO.getAll();
					System.out.println();
					break;
				}
				
				case "9":{
					ExercicioDAO exercicioDAO = new ExercicioDAO();
					exercicioDAO.insert("Tríceps Testa com Barra W", 3, 20);
					exercicioDAO.insert("Kettlebell - Glúteos/Costas", 3, 12);
					exercicioDAO.insert("Abdominal com bola", 3, 10);
					exercicioDAO.insert("Agachamento livre com halteres", 4, 12);
					exercicioDAO.insert("Supino Reto com Barra", 3, 10);
					System.out.println("Linhas adicionadas com sucesso !!!");
					System.out.println();
					break;
				}
				
				case "10":{
					ExercicioDAO exercicioDAO = new ExercicioDAO();
					System.out.println("--------------------REGISTRO DE EXERCICIO---------------------");
					exercicioDAO.getAll();
					System.out.println();
					break;
				}
				
				case "11":{
					loop = false;
					System.out.println();
					break;
				}
				default:{
					System.out.println("ERRO - COMANDO INCORRETO !!");
					System.out.println();
				}
			
			}
		}while(loop);
		
		sc.close();
		
		System.out.println("PROGRAMA FINALIZADO !!");

	}

}
