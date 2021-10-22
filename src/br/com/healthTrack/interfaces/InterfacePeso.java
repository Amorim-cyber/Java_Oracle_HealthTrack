package br.com.healthTrack.interfaces;

import java.sql.Date;

public interface InterfacePeso {
	
	public abstract void getAll();
	
	public abstract void insert(Double valorPeso,Date registroPeso,Long idUsuario);

}
