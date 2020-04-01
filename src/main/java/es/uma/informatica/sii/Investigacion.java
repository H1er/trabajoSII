package es.uma.informatica.sii;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Investigacion
 *
 */
@Entity

public class Investigacion extends Actividad implements Serializable {

	
	private String Tipo_investigacion;
	private static final long serialVersionUID = 1L;

	public Investigacion() {
		super();
	}   
	public String getTipo_investigacion() {
		return this.Tipo_investigacion;
	}

	public void setTipo_investigacion(String Tipo_investigacion) {
		this.Tipo_investigacion = Tipo_investigacion;
	}
   
}
