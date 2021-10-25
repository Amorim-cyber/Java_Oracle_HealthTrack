package br.com.healthTrack.interfaces;

import java.util.Calendar;

public interface InterfacePressao {
	
	public abstract void getAll();
	
	public abstract void insert(Double valorPressao,Calendar registroPressao,Long idUsuario);

}
