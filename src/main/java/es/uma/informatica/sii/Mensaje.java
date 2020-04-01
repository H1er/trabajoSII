package es.uma.informatica.sii;


import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;
import java.util.Date;


/**
 * Entity implementation class for Entity: Mensaje
 *
 */
@Entity

public class Mensaje implements Serializable {

	   
	@Id
	private Integer id;
	@Temporal(TemporalType.DATE)
	private Date Fecha;
	private String Asunto;
	private String Texto;
	private static final long serialVersionUID = 1L;

	public Mensaje() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Date getFecha() {
		return this.Fecha;
	}

	public void setFecha(Date Fecha) {
		this.Fecha = Fecha;
	}   
	public String getAsunto() {
		return this.Asunto;
	}

	public void setAsunto(String Asunto) {
		this.Asunto = Asunto;
	}   
	public String getTexto() {
		return this.Texto;
	}

	public void setTexto(String Texto) {
		this.Texto = Texto;
	}
	
	@Embeddable
	public class MensajePK implements java.io.Serializable {
		@EmbeddedId
		@Column(name="Codigo_mensaje",nullable=false)
		private Integer Codigo_mensaje; 
		@EmbeddedId
		@Column(name="Codigo_emisor",nullable=false)
		private Integer Codigo_emisor; 
		@EmbeddedId
		@Column(name="Codigo_receptor",nullable=false)
		private Integer Codigo_receptor; 
		
	}
   
}
