package es.uma.informatica.sii;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Personal_Administracion
 *
 */
@Entity

public class Personal_Administracion extends Usuario implements Serializable {

	
	private String Tipo;
	private static final long serialVersionUID = 1L;

	public Personal_Administracion() {
		super();
	}   
	public String getTipo() {
		return this.Tipo;
	}

	public void setTipo(String Tipo) {
		this.Tipo = Tipo;
	}
   
}
