package it.epicode.be.gestioneventi.model;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "partiteVinteInCasa", query = "SELECT p FROM PartitaDiCalcio p WHERE p.squadraVincente = p.squadraDiCasa")
@NamedQuery(name = "partiteVinteInTrasferta", query = "SELECT p FROM PartitaDiCalcio p WHERE p.squadraVincente = p.squadraOspite")
@NamedQuery(name = "partitePareggiate", query = "SELECT p FROM PartitaDiCalcio p WHERE p.squadraVincente IS NULL")
public class PartitaDiCalcio extends Evento {
	
	private String squadraDiCasa;
	private String squadraOspite;
	private String squadraVincente;
	private Integer numGolCasa = 0;
	private Integer numGolOspite = 0;
	public String getSquadraDiCasa() {
		return squadraDiCasa;
	}
	public void setSquadraDiCasa(String squadraDiCasa) {
		this.squadraDiCasa = squadraDiCasa;
	}
	public String getSquadraOspite() {
		return squadraOspite;
	}
	public void setSquadraOspite(String squadraOspite) {
		this.squadraOspite = squadraOspite;
	}
	public String getSquadraVincente() {
		return squadraVincente;
	}
	public void setSquadraVincente(String squadraVincente) {
		this.squadraVincente = squadraVincente;
	}
	public Integer getNumGolCasa() {
		return numGolCasa;
	}
	public void setNumGolCasa(Integer numGolCasa) {
		this.numGolCasa = numGolCasa;
	}
	public Integer getNumGolOspite() {
		return numGolOspite;
	}
	public void setNumGolOspite(Integer numGolOspite) {
		this.numGolOspite = numGolOspite;
	}
	
	

}
