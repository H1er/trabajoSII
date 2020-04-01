package es.uma.informatica.sii;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Formacion
 *
 */
@Entity

public class Formacion extends Actividad implements Serializable {

	
	private String Tipo_formacion;
	private static final long serialVersionUID = 1L;

	public Formacion() {
		super();
	}   
	public String getTipo_formacion() {
		return this.Tipo_formacion;
	}

	public void setTipo_formacion(String Tipo_formacion) {
		this.Tipo_formacion = Tipo_formacion;
	}
   
}
