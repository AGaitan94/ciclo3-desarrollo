
package co.edu.uniandes.csw.producto.persistence.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class _ProductoEntity {

	@Id
	@GeneratedValue(generator = "Producto")
	private Long id;
	private String name;
	private Integer cantidadDisponible;
	private Integer cantidadEnProceso;
	private Integer tiempoEspera;
	private Integer cantidadMinima;
	private Integer cantidadMaxima;

	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public Integer getCantidadDisponible(){
		return cantidadDisponible;
	}
	
	public void setCantidadDisponible(Integer cantidadDisponible){
		this.cantidadDisponible = cantidadDisponible;
	}
	public Integer getCantidadEnProceso(){
		return cantidadEnProceso;
	}
	
	public void setCantidadEnProceso(Integer cantidadEnProceso){
		this.cantidadEnProceso = cantidadEnProceso;
	}
	public Integer getTiempoEspera(){
		return tiempoEspera;
	}
	
	public void setTiempoEspera(Integer tiempoEspera){
		this.tiempoEspera = tiempoEspera;
	}
	public Integer getCantidadMinima(){
		return cantidadMinima;
	}
	
	public void setCantidadMinima(Integer cantidadMinima){
		this.cantidadMinima = cantidadMinima;
	}
	public Integer getCantidadMaxima(){
		return cantidadMaxima;
	}
	
	public void setCantidadMaxima(Integer cantidadMaxima){
		this.cantidadMaxima = cantidadMaxima;
	}
}