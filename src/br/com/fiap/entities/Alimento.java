package br.com.fiap.entities;

import java.sql.Date;

public class Alimento {
	
	private Long idAlimento;
	private String nomeAlimento;
	private Double caloriasAlimento;
	private Date horaConsumo;
	
	public Long getIdAlimento() {
		return idAlimento;
	}
	public void setIdAlimento(Long idAlimento) {
		this.idAlimento = idAlimento;
	}
	public String getNomeAlimento() {
		return nomeAlimento;
	}
	public void setNomeAlimento(String nomeAlimento) {
		this.nomeAlimento = nomeAlimento;
	}
	public Double getCaloriasAlimento() {
		return caloriasAlimento;
	}
	public void setCaloriasAlimento(Double caloriasAlimento) {
		this.caloriasAlimento = caloriasAlimento;
	}
	public Date getHoraConsumo() {
		return horaConsumo;
	}
	public void setHoraConsumo(Date horaConsumo) {
		this.horaConsumo = horaConsumo;
	}
	@Override
	public String toString() {
		return "Alimento [idAlimento=" + idAlimento + 
				", nomeAlimento=" + nomeAlimento + 
				", caloriasAlimento=" + caloriasAlimento + 
				", horaConsumo=" + horaConsumo + "]";
	}
	
}
