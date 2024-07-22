package com.api.venta.infrastructure.adapters.in.rest.mapper;

import com.api.venta.domain.models.Venta;
import com.api.venta.infrastructure.adapters.in.rest.controller.request.VentaRequest;
import com.api.venta.infrastructure.adapters.in.rest.controller.response.VentaResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-19T11:29:22-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class VentaMapperApiImpl implements VentaMapperApi {

    @Override
    public Venta toModel(VentaRequest ventaRequest) {
        if ( ventaRequest == null ) {
            return null;
        }

        Venta venta = new Venta();

        venta.setId( ventaRequest.getId() );
        venta.setSellDate( ventaRequest.getSellDate() );
        venta.setMedicineID( ventaRequest.getMedicineID() );
        venta.setAmount( ventaRequest.getAmount() );
        venta.setValue( ventaRequest.getValue() );
        venta.setTotal( ventaRequest.getTotal() );

        return venta;
    }

    @Override
    public VentaResponse toResponse(Venta venta) {
        if ( venta == null ) {
            return null;
        }

        VentaResponse ventaResponse = new VentaResponse();

        ventaResponse.setId( venta.getId() );
        ventaResponse.setSellDate( venta.getSellDate() );
        ventaResponse.setMedicineID( venta.getMedicineID() );
        ventaResponse.setAmount( venta.getAmount() );
        ventaResponse.setValue( venta.getValue() );
        ventaResponse.setTotal( venta.getTotal() );

        return ventaResponse;
    }

    @Override
    public List<VentaResponse> toResponse(List<Venta> ventas) {
        if ( ventas == null ) {
            return null;
        }

        List<VentaResponse> list = new ArrayList<VentaResponse>( ventas.size() );
        for ( Venta venta : ventas ) {
            list.add( toResponse( venta ) );
        }

        return list;
    }
}
