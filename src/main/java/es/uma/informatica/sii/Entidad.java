package es.uma.informatica.sii;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Entidad
 *
 */
@Entity

public class Entidad extends Usuario implements Serializable {

	
	private String Nombre;
	private String Direccion;
	private String Telefono;
	private String mail;
	private String Pais;
	private String Ciudad;
	private String Tipo_origen;
	private String Pagina_web;
	@OneToOne
	private Informe inf; 
	@ManyToOne
	private ValoracionVoluntariado vv;  
	private ValoracionFormacionInvestigacion vfi; 
	private static final long serialVersionUID = 1L;

	public Entidad() {
		super();
	}   
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}   
	public String getDireccion() {
		return this.Direccion;
	}

	public void setDireccion(String Direccion) {
		this.Direccion = Direccion;
	}   
	public String getTelefono() {
		return this.Telefono;
	}

	public void setTelefono(String Telefono) {
		this.Telefono = Telefono;
	}   
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
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
	public String getTipo_origen() {
		return this.Tipo_origen;
	}

	public void setTipo_origen(String Tipo_origen) {
		this.Tipo_origen = Tipo_origen;
	}   
	public String getPagina_web() {
		return this.Pagina_web;
	}

	public void setPagina_web(String Pagina_web) {
		this.Pagina_web = Pagina_web;
	}
   
}
