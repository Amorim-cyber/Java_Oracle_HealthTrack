package br.com.fiap.entities;

import java.sql.Date;

public class Peso {
	
	private Long idPeso;
	private Double valorPeso;
	private Date registroPeso;
	private Long idUsuario;
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
	public Date getRegistroPeso() {
		return registroPeso;
	}
	public void setRegistroPeso(Date registroPeso) {
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
		return "Peso [idPeso=" + idPeso + 
				", valorPeso=" + valorPeso + 
				", registroPeso=" + registroPeso + 
				", idUsuario=" + idUsuario + 
				"]";
	}
	
	

}
