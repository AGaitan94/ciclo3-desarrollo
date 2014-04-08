
package co.edu.uniandes.csw.factura.logic.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public abstract class _FacturaDTO {

	private Long id;
	private Date fecha;
	private Double costoTotal;

	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
 
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Double getCostoTotal() {
		return costoTotal;
	}
 
	public void setCostoTotal(Double costototal) {
		this.costoTotal = costototal;
	}
	
}