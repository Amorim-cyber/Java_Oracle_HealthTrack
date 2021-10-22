package br.com.healthTrack.interfaces;

import java.sql.Date;

public interface InterfaceAlimento {

	public abstract void getAll();
	
	public abstract void insert(String nomeAlimento,Double caloriasAlimento,Date horaConsumo,Long idUsuario);
	
}
