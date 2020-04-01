package es.uma.informatica.sii;


import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Voluntariado
 *
 */
@Entity

public class Voluntariado extends Actividad implements Serializable {

	
	private String Tipo_voluntariado;
	private static final long serialVersionUID = 1L;

	public Voluntariado() {
		super();
	}   
	public String getTipo_voluntariado() {
		return this.Tipo_voluntariado;
	}

	public void setTipo_voluntariado(String Tipo_voluntariado) {
		this.Tipo_voluntariado = Tipo_voluntariado;
	}
   
}
