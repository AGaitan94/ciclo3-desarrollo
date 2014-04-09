
package co.edu.uniandes.csw.factura.persistence.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class _FacturaEntity {

	@Id
	@GeneratedValue(generator = "Factura")
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date fecha;
	private Double costoTotal;
	private String name;

	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	public Date getFecha(){
		return fecha;
	}
	
	public void setFecha(Date fecha){
		this.fecha = fecha;
	}
	public Double getCostoTotal(){
		return costoTotal;
	}
	
	public void setCostoTotal(Double costoTotal){
		this.costoTotal = costoTotal;
	}
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}