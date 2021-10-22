package br.com.healthTrack.interfaces;

import java.sql.Date;

public interface InterfaceAtividade {

	public abstract void getAll();
	
	public abstract void insert(Long idUsuario,Long idExercicio,Date dataAtividade);
	
}
