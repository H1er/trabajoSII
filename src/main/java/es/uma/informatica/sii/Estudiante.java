package es.uma.informatica.sii;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Estudiante
 *
 */
@Entity

public class Estudiante extends Usuario implements Serializable {

	
	private Integer Curso;
	private String Titulacion;
	@OneToOne
	private ValoracionVoluntariado vv; 
	private static final long serialVersionUID = 1L;

	public Estudiante() {
		super();
	}   
	public Integer getCurso() {
		return this.Curso;
	}

	public void setCurso(Integer Curso) {
		this.Curso = Curso;
	}   
	public String getTitulacion() {
		return this.Titulacion;
	}

	public void setTitulacion(String Titulacion) {
		this.Titulacion = Titulacion;
	}
   
}
