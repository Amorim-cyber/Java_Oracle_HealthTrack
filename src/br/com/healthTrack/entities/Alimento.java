package br.com.healthTrack.entities;

import java.sql.Date;

public class Alimento {
	
	private Long idAlimento;
	private String nomeAlimento;
	private Double caloriasAlimento;
	private Date horaConsumo;
	private Long idUsuario;
	
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
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	@Override
	public String toString() {
		return "Alimento [idAlimento=" + idAlimento + 
				", nomeAlimento=" + nomeAlimento + 
				", caloriasAlimento=" + caloriasAlimento + 
				", horaConsumo=" + horaConsumo + 
				", idUsuario=" + idUsuario + 
				"]";
	}
	
	
	
}
