
package co.edu.uniandes.csw.item.logic.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public abstract class _ItemDTO {

	private Long id;
	private Double costo;
	private Date fechaExp;
	private Integer cantidad;
	private String name;

	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}
	public Double getCosto() {
		return costo;
	}
 
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	public Date getFechaExp() {
		return fechaExp;
	}
 
	public void setFechaExp(Date fechaexp) {
		this.fechaExp = fechaexp;
	}
	public Integer getCantidad() {
		return cantidad;
	}
 
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
	
}