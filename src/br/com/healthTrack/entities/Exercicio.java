package br.com.healthTrack.entities;

public class Exercicio {
	
	private Long idExercicio;
	private String nomeExercicio;
	private Integer setsExercicio;
	private Integer repeticaoExercicio;
	public Long getIdExercicio() {
		return idExercicio;
	}
	public void setIdExercicio(Long idExercicio) {
		this.idExercicio = idExercicio;
	}
	public String getNomeExercicio() {
		return nomeExercicio;
	}
	public void setNomeExercicio(String nomeExercicio) {
		this.nomeExercicio = nomeExercicio;
	}
	public Integer getSetsExercicio() {
		return setsExercicio;
	}
	public void setSetsExercicio(Integer setsExercicio) {
		this.setsExercicio = setsExercicio;
	}
	public Integer getRepeticaoExercicio() {
		return repeticaoExercicio;
	}
	public void setRepeticaoExercicio(Integer repeticaoExercicio) {
		this.repeticaoExercicio = repeticaoExercicio;
	}
	@Override
	public String toString() {
		return "Exercicio [idExercicio=" + idExercicio + 
				", nomeExercicio=" + nomeExercicio + 
				", setsExercicio=" + setsExercicio + 
				", repeticaoExercicio=" + repeticaoExercicio +
				"]";
	}
	
	

}
