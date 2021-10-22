package br.com.healthTrack.entities;

import java.sql.Date;

public class Pressao {
	
	private Long idPressao;
	private Double valorPressao;
	private Date registroPressao;
	private Long idUsuario;
	
	public Long getIdPressao() {
		return idPressao;
	}
	public void setIdPressao(Long idPressao) {
		this.idPressao = idPressao;
	}
	public Double getValorPressao() {
		return valorPressao;
	}
	public void setValorPressao(Double valorPressao) {
		this.valorPressao = valorPressao;
	}
	public Date getRegistroPressao() {
		return registroPressao;
	}
	public void setRegistroPressao(Date registroPressao) {
		this.registroPressao = registroPressao;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	@Override
	public String toString() {
		return "Pressao [idPressao=" + idPressao + 
				", valorPressao=" + valorPressao + 
				", registroPressao=" + registroPressao + 
				", idUsuario=" + idUsuario + 
				"]";
	}
	
	
	
	

}
