package it.epicode.be.gestioneventi.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "garePerVincitore", query = "SELECT g FROM GaraDiAtletica g WHERE g.vincitore = :persona ")
@NamedQuery(name = "garePerPartecipante", query = "SELECT g FROM GaraDiAtletica g WHERE :persona MEMBER OF g.setAtleti")
public class GaraDiAtletica extends Evento {
	
	
	@ManyToMany
	private Set<Persona> setAtleti;
	
	@ManyToOne
	private Persona vincitore;

	public Set<Persona> getSetAtleti() {
		return setAtleti;
	}

	public void setSetAtleti(Set<Persona> setAtleti) {
		this.setAtleti = setAtleti;
	}

	public Persona getVincitore() {
		return vincitore;
	}

	public void setVincitore(Persona vincitore) {
		this.vincitore = vincitore;
	}
	
	

}
