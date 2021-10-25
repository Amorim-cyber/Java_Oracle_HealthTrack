package br.com.healthTrack.interfaces;

import java.util.Calendar;

public interface InterfaceAlimento {

	public abstract void getAll();
	
	public abstract void insert(String nomeAlimento,Double caloriasAlimento,Calendar horaConsumo,Long idUsuario);
	
}
