package br.com.fiap.entities;

import java.sql.Date;

public class Atividade {
	
	private Long idAtividade;
	private Long idUsuario;
	private Long idExercicio;
	private Date dataAtividade;
	
	public Long getIdAtividade() {
		return idAtividade;
	}
	public void setIdAtividade(Long idAtividade) {
		this.idAtividade = idAtividade;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Long getIdExercicio() {
		return idExercicio;
	}
	public void setIdExercicio(Long idExercicio) {
		this.idExercicio = idExercicio;
	}
	public Date getDataAtividade() {
		return dataAtividade;
	}
	public void setDataAtividade(Date dataAtividade) {
		this.dataAtividade = dataAtividade;
	}
	@Override
	public String toString() {
		return "Atividade [idAtividade=" + idAtividade + 
				", idUsuario=" + idUsuario + 
				", idExercicio=" + idExercicio
				+ ", dataAtividade=" + dataAtividade + 
				"]";
	}
	
	

}
