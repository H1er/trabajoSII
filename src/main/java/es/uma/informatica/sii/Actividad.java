package es.uma.informatica.sii;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: Actividad
 *
 */
@Entity
@MappedSuperclass  
public class Actividad implements Serializable {
	
	
	@Temporal(TemporalType.DATE)
	private Date Fecha;
	private String Localizacion;
	private String Descripcion;
	private Integer Duracion;
	@OneToOne
	private Usuario usrx; 
	@ManyToOne
	private Usuario usr;
	private String Disponibilidad;
	private Integer NumPersonas;   
	@Id
	private Integer Codigo;
	@OneToMany 
	private List <Preferencia> prs;
	
	@JoinTable (name="Servicio")
	private List <Servicio> lista_servicio; 
	
	private static final long serialVersionUID = 1L;
	

	public Actividad() {
		super();
	}   
	public Date getFecha() {
		return this.Fecha;
	}

	public void setFecha(Date Fecha) {
		this.Fecha = Fecha;
	}   
	public String getLocalizacion() {
		return this.Localizacion;
	}

	public void setLocalizacion(String Localizacion) {
		this.Localizacion = Localizacion;
	}   
	public String getDescripcion() {
		return this.Descripcion;
	}

	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}   
	public Integer getDuracion() {
		return this.Duracion;
	}

	public void setDuracion(Integer Duracion) {
		this.Duracion = Duracion;
	}   
	public String getDisponibilidad() {
		return this.Disponibilidad;
	}

	public void setDisponibilidad(String Disponibilidad) {
		this.Disponibilidad = Disponibilidad;
	}   
	public Integer getNumPersonas() {
		return this.NumPersonas;
	}

	public void setNumPersonas(Integer NumPersonas) {
		this.NumPersonas = NumPersonas;
	}   
	public Integer getCodigo() {
		return this.Codigo;
	}

	public void setCodigo(Integer Codigo) {
		this.Codigo = Codigo;
	}
   
}
