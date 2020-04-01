package es.uma.informatica.sii;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Servicio
 *
 */
@Entity

public class Servicio implements Serializable {

	 
	@Id
	private Integer Codigo;
	private String Pais;
	private String Ciudad;
	private Integer Horas;
	private Integer NumParticipantes;
	private String Descripcion;
	@ManyToMany 
	private List <Usuario> servicios_en; 
	private static final long serialVersionUID = 1L;
	@ManyToOne 
	private Actividad Act; 
	
	public Servicio() {
		super();
	}   
	public Integer getCodigo() {
		return this.Codigo;
	}

	public void setCodigo(Integer codigo) {
		this.Codigo = codigo;
	}   
	public String getPais() {
		return this.Pais;
	}

	public void setPais(String Pais) {
		this.Pais = Pais;
	}   
	public String getCiudad() {
		return this.Ciudad;
	}

	public void setCiudad(String Ciudad) {
		this.Ciudad = Ciudad;
	}   
	public Integer getHoras() {
		return this.Horas;
	}

	public void setHoras(Integer Horas) {
		this.Horas = Horas;
	}   
	public Integer getNumParticipantes() {
		return this.NumParticipantes;
	}

	public void setNumParticipantes(Integer NumParticipantes) {
		this.NumParticipantes = NumParticipantes;
	}   
	public String getDescripcion() {
		return this.Descripcion;
	}

	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}
   
}
