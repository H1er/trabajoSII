package es.uma.informatica.sii;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: ValoracionFormacionInvestigacion
 *
 */
@Entity

public class ValoracionFormacionInvestigacion implements Serializable {

	@Id
	private Integer Codigo; 
	private Integer Calificacion;
	private String Descripcion;
	@OneToMany
	private List <Docente> realizado_por;
	private List <Entidad> valorado_por; 
	private static final long serialVersionUID = 1L;

	public ValoracionFormacionInvestigacion() {
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
	public class ValoracionFomracionInestigacionPK implements java.io.Serializable {
		@EmbeddedId
		@Column(name="Codigo",nullable=false)
		private Integer Codigo; 
		@EmbeddedId
		@Column(name="tipo_formacion",nullable=false)
		private Integer tipo_formacion; 
		@EmbeddedId
		@Column(name="tipo_investigacion",nullable=false)
		private Integer tipo_investigacion; 
		
	}
}
