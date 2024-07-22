package com.api.venta.infrastructure.adapters.in.rest.mapper;


import com.api.venta.domain.models.Venta;
import com.api.venta.infrastructure.adapters.in.rest.controller.request.VentaRequest;
import com.api.venta.infrastructure.adapters.in.rest.controller.response.VentaResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VentaMapperApi {
    Venta toModel(VentaRequest ventaRequest);
    VentaResponse toResponse (Venta venta);
    List<VentaResponse> toResponse(List<Venta> ventas);


}
