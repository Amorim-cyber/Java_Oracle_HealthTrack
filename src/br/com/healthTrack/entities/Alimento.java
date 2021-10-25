package br.com.healthTrack.entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Alimento {
	
	private Long idAlimento;
	private String nomeAlimento;
	private Double caloriasAlimento;
	private Calendar horaConsumo;
	private Long idUsuario;
	
	public Alimento(Long idAlimento, String nomeAlimento, Double caloriasAlimento, Calendar horaConsumo, Long idUsuario) {
		this.idAlimento = idAlimento;
		this.nomeAlimento = nomeAlimento;
		this.caloriasAlimento = caloriasAlimento;
		this.horaConsumo = horaConsumo;
		this.idUsuario = idUsuario;
	}
	
	public Alimento(String nomeAlimento, Double caloriasAlimento, Calendar horaConsumo, Long idUsuario) {
		this.nomeAlimento = nomeAlimento;
		this.caloriasAlimento = caloriasAlimento;
		this.horaConsumo = horaConsumo;
		this.idUsuario = idUsuario;
	}
	
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
	
	public Calendar getHoraConsumo() {
		return horaConsumo;
	}

	public void setHoraConsumo(Calendar horaConsumo) {
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
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		return idAlimento + 
				"\t\t" + idUsuario +
				"\t\t" + nomeAlimento + 
				"\t\t" + caloriasAlimento + 
				"\t\t" + sdf.format(horaConsumo.getTime());
	}
	
	
	
}
