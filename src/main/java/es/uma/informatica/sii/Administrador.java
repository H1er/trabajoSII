package es.uma.informatica.sii;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Administrador
 *
 */
@Entity

public class Administrador extends Usuario implements Serializable {


	
	@OneToMany
	private List <Usuario> usrs;
	@OneToOne
	private Actividad aprobada; 
	private String Rango;
	private static final long serialVersionUID = 1L;

	public Administrador() {
		super();
	}   
	public String getRango() {
		return this.Rango;
	}

	public void setRango(String Rango) {
		this.Rango = Rango;
	}
   
}
