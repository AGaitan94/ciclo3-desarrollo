
package co.edu.uniandes.csw.producto.logic.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public abstract class _ProductoDTO {

	private Long id;
	private String name;
	private Integer cantidadDisponible;
	private Integer cantidadEnProceso;
	private Integer tiempoEspera;
	private Integer cantidadMinima;
	private Integer cantidadMaxima;

	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCantidadDisponible() {
		return cantidadDisponible;
	}
 
	public void setCantidadDisponible(Integer cantidaddisponible) {
		this.cantidadDisponible = cantidaddisponible;
	}
	public Integer getCantidadEnProceso() {
		return cantidadEnProceso;
	}
 
	public void setCantidadEnProceso(Integer cantidadenproceso) {
		this.cantidadEnProceso = cantidadenproceso;
	}
	public Integer getTiempoEspera() {
		return tiempoEspera;
	}
 
	public void setTiempoEspera(Integer tiempoespera) {
		this.tiempoEspera = tiempoespera;
	}
	public Integer getCantidadMinima() {
		return cantidadMinima;
	}
 
	public void setCantidadMinima(Integer cantidadminima) {
		this.cantidadMinima = cantidadminima;
	}
	public Integer getCantidadMaxima() {
		return cantidadMaxima;
	}
 
	public void setCantidadMaxima(Integer cantidadmaxima) {
		this.cantidadMaxima = cantidadmaxima;
	}
	
}