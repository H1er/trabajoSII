package es.uma.informatica.sii;


import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Profesores
 *
 */
@Entity

public class Docente extends Usuario implements Serializable {

	
	private String Departamento;
	private String Asignatura;
	@ManyToOne
	private Informe inf;
	private ValoracionVoluntariado vv;  
	private ValoracionFormacionInvestigacion vfi; 
	private static final long serialVersionUID = 1L;

	public Docente() {
		super();
	}   
	public String getDepartamento() {
		return this.Departamento;
	}

	public void setDepartamento(String Departamento) {
		this.Departamento = Departamento;
	}   
	public String getAsignatura() {
		return this.Asignatura;
	}

	public void setAsignatura(String Asignatura) {
		this.Asignatura = Asignatura;
	}
   
}
