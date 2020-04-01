package es.uma.informatica.sii;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity

public class Usuario implements Serializable {

	   
	@Id
	private String mail;
	private String DNI;
	private String Contraseña;
	private String Nombre;
	private String Apellido1;
	private String Apellido2;
	@Temporal(TemporalType.DATE)
	private Date FechaNacimiento;
	@ManyToMany (mappedBy = "servicios_en")
	private List <Servicio> participa_en;
	@OneToMany
	private List <Actividad> act;
	@ManyToOne
	private Administrador admin; 
	private Preferencia pr; 
	private static final long serialVersionUID = 1L;


	public Usuario() {
		super();
	}   
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}   
	public String getDNI() {
		return this.DNI;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}   
	public String getContraseña() {
		return this.Contraseña;
	}

	public void setContraseña(String Contraseña) {
		this.Contraseña = Contraseña;
	}   
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}   
	public String getApellido1() {
		return this.Apellido1;
	}

	public void setApellido1(String Apellido1) {
		this.Apellido1 = Apellido1;
	}   
	public String getApellido2() {
		return this.Apellido2;
	}

	public void setApellido2(String Apellido2) {
		this.Apellido2 = Apellido2;
	}   
	public Date getFechaNacimiento() {
		return this.FechaNacimiento;
	}

	public void setFechaNacimiento(Date FechaNacimiento) {
		this.FechaNacimiento = FechaNacimiento;
	}
   
}
