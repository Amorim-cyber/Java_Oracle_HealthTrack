package br.com.healthTrack.entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Peso {
	
	private Long idPeso;
	private Double valorPeso;
	private Calendar registroPeso;
	private Long idUsuario;
	
	public Peso(Long idPeso, Double valorPeso, Calendar registroPeso, Long idUsuario) {
		this.idPeso = idPeso;
		this.valorPeso = valorPeso;
		this.registroPeso = registroPeso;
		this.idUsuario = idUsuario;
	}
	
	public Peso(Double valorPeso, Calendar registroPeso, Long idUsuario) {
		this.valorPeso = valorPeso;
		this.registroPeso = registroPeso;
		this.idUsuario = idUsuario;
	}
	
	public Long getIdPeso() {
		return idPeso;
	}
	public void setIdPeso(Long idPeso) {
		this.idPeso = idPeso;
	}
	public Double getValorPeso() {
		return valorPeso;
	}
	public void setValorPeso(Double valorPeso) {
		this.valorPeso = valorPeso;
	}
	
	public Calendar getRegistroPeso() {
		return registroPeso;
	}

	public void setRegistroPeso(Calendar registroPeso) {
		this.registroPeso = registroPeso;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		return idPeso + 
				"\t\t" + idUsuario + 
				"\t\t\t" + valorPeso + 
				"\t\t" + 
				sdf.format(registroPeso.getTime());
	}
	
	

}
