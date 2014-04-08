
package co.edu.uniandes.csw.item.persistence.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class _ItemEntity {

	@Id
	@GeneratedValue(generator = "Item")
	private Long id;
	private Double costo;
	@Temporal(TemporalType.DATE)
	private Date fechaExp;
	private Integer cantidad;

	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	public Double getCosto(){
		return costo;
	}
	
	public void setCosto(Double costo){
		this.costo = costo;
	}
	public Date getFechaExp(){
		return fechaExp;
	}
	
	public void setFechaExp(Date fechaExp){
		this.fechaExp = fechaExp;
	}
	public Integer getCantidad(){
		return cantidad;
	}
	
	public void setCantidad(Integer cantidad){
		this.cantidad = cantidad;
	}
}