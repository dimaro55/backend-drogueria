package com.api.venta.infrastructure.ports.out.database.mapper;

import com.api.venta.domain.models.Venta;
import com.api.venta.infrastructure.adapters.out.database.entities.VentaEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VentaMapper {
    VentaEntity toEntity(Venta venta);
    Venta toModel(VentaEntity ventaEntity);
    List<Venta> toModel(List<VentaEntity> ventaEntities);
}
