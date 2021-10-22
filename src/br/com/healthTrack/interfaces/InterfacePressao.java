package br.com.healthTrack.interfaces;

import java.sql.Date;

public interface InterfacePressao {
	
	public abstract void getAll();
	
	public abstract void insert(Double valorPressao,Date registroPressao,Long idUsuario);

}
