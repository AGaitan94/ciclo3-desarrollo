
package co.edu.uniandes.csw.producto.persistence.converter;

import java.util.ArrayList;
import java.util.List;

import co.edu.uniandes.csw.producto.logic.dto.ProductoDTO;
import co.edu.uniandes.csw.producto.persistence.entity.ProductoEntity;

public abstract class _ProductoConverter {


	public static ProductoDTO entity2PersistenceDTO(ProductoEntity entity){
		if (entity != null) {
			ProductoDTO dto = new ProductoDTO();
				dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setCantidadDisponible(entity.getCantidadDisponible());
				dto.setCantidadEnProceso(entity.getCantidadEnProceso());
				dto.setTiempoEspera(entity.getTiempoEspera());
				dto.setCantidadMinima(entity.getCantidadMinima());
				dto.setCantidadMaxima(entity.getCantidadMaxima());
			return dto;
		}else{
			return null;
		}
	}
	
	public static ProductoEntity persistenceDTO2Entity(ProductoDTO dto){
		if(dto!=null){
			ProductoEntity entity=new ProductoEntity();
			entity.setId(dto.getId());
			entity.setName(dto.getName());
			entity.setCantidadDisponible(dto.getCantidadDisponible());
			entity.setCantidadEnProceso(dto.getCantidadEnProceso());
			entity.setTiempoEspera(dto.getTiempoEspera());
			entity.setCantidadMinima(dto.getCantidadMinima());
			entity.setCantidadMaxima(dto.getCantidadMaxima());
			return entity;
		}else {
			return null;
		}
	}
	
	public static List<ProductoDTO> entity2PersistenceDTOList(List<ProductoEntity> entities){
		List<ProductoDTO> dtos=new ArrayList<ProductoDTO>();
		for(ProductoEntity entity:entities){
			dtos.add(entity2PersistenceDTO(entity));
		}
		return dtos;
	}
	
	public static List<ProductoEntity> persistenceDTO2EntityList(List<ProductoDTO> dtos){
		List<ProductoEntity> entities=new ArrayList<ProductoEntity>();
		for(ProductoDTO dto:dtos){
			entities.add(persistenceDTO2Entity(dto));
		}
		return entities;
	}
}