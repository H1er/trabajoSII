package es.uma.informatica.sii;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Preferencia
 *
 */
@Entity

public class Preferencia implements Serializable {

	
	private Integer NumHoras;
	private String Idiomas;
	private Integer Turno;
	private String TipoActividad;   
	@Id
	private Integer codigo;
	@OneToMany 
	private List <Usuario> usrs;
	@ManyToOne
	private Actividad act; 
	
	private static final long serialVersionUID = 1L;

	public Preferencia() {
		super();
	}   
	public Integer getNumHoras() {
		return this.NumHoras;
	}

	public void setNumHoras(Integer NumHoras) {
		this.NumHoras = NumHoras;
	}   
	public String getIdiomas() {
		return this.Idiomas;
	}

	public void setIdiomas(String Idiomas) {
		this.Idiomas = Idiomas;
	}   
	public Integer getTurno() {
		return this.Turno;
	}

	public void setTurno(Integer Turno) {
		this.Turno = Turno;
	}   
	public String getTipoActividad() {
		return this.TipoActividad;
	}

	public void setTipoActividad(String TipoActividad) {
		this.TipoActividad = TipoActividad;
	}   
	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
   
}
