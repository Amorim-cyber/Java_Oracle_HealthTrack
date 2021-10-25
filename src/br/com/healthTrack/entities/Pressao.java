package br.com.healthTrack.entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pressao {
	
	private Long idPressao;
	private Double valorPressao;
	private Calendar registroPressao;
	private Long idUsuario;
	
	public Pressao(Long idPressao, Double valorPressao, Calendar registroPressao, Long idUsuario) {
		this.idPressao = idPressao;
		this.valorPressao = valorPressao;
		this.registroPressao = registroPressao;
		this.idUsuario = idUsuario;
	}
	
	public Pressao(Double valorPressao, Calendar registroPressao, Long idUsuario) {
		this.valorPressao = valorPressao;
		this.registroPressao = registroPressao;
		this.idUsuario = idUsuario;
	}
	
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
	
	public Calendar getRegistroPressao() {
		return registroPressao;
	}

	public void setRegistroPressao(Calendar registroPressao) {
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
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		return idPressao + 
				"\t\t" + idUsuario +
				"\t\t\t" + valorPressao + 
				"\t\t\t" +
				sdf.format(registroPressao.getTime());
	}
	
	
	
	

}
