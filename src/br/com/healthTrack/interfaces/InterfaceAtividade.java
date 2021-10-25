package br.com.healthTrack.interfaces;

import java.util.Calendar;

public interface InterfaceAtividade {

	public abstract void getAll();
	
	public abstract void insert(Long idUsuario,Long idExercicio,Calendar dataAtividade);
	
}
