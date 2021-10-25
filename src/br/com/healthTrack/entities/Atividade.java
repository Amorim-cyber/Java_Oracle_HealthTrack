package br.com.healthTrack.entities;

import java.util.Calendar;

public class Atividade {
	
	private Long idAtividade;
	private Long idUsuario;
	private Long idExercicio;
	private Calendar dataAtividade;
	
	public Atividade(Long idAtividade, Long idUsuario, Long idExercicio, Calendar dataAtividade) {
		this.idAtividade = idAtividade;
		this.idUsuario = idUsuario;
		this.idExercicio = idExercicio;
		this.dataAtividade = dataAtividade;
	}
	
	public Atividade(Long idUsuario, Long idExercicio, Calendar dataAtividade) {
		this.idUsuario = idUsuario;
		this.idExercicio = idExercicio;
		this.dataAtividade = dataAtividade;
	}
	
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
	
	public Calendar getDataAtividade() {
		return dataAtividade;
	}

	public void setDataAtividade(Calendar dataAtividade) {
		this.dataAtividade = dataAtividade;
	}

	@Override
	public String toString() {
		return idAtividade + 
				"\t" + idUsuario + 
				"\t" + idExercicio + 
				"\t" + dataAtividade;
	}
	
	

}
