package es.uma.informatica.sii;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: ValoracionVoluntariado
 *
 */
@Entity

public class ValoracionVoluntariado implements Serializable {

	@Id
	private Integer Codigo; 
	private Integer Calificacion;
	private String Descripcion;
	@OneToOne
	private Estudiante est;
	@OneToMany
	private List <Docente> realizado_por;
	private List <Entidad> valorado_por; 
	private static final long serialVersionUID = 1L;

	public ValoracionVoluntariado() {
		super();
	}   
	public Integer getCalificacion() {
		return this.Calificacion;
	}

	public void setCalificacion(Integer Calificacion) {
		this.Calificacion = Calificacion;
	}   
	public String getDescripcion() {
		return this.Descripcion;
	}

	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}
   
	@Embeddable
	public class VoluntariadoPK implements java.io.Serializable {
		@EmbeddedId
		@Column(name="Codigo_voluntariado",nullable=false)
		private Integer Codigo_voluntariado; 
		@EmbeddedId
		@Column(name="Codigo_valoracion",nullable=false)
		private Integer Codigo_valoracion; 
		
	}
	
}
