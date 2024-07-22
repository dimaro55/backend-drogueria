package com.api.venta.infrastructure.ports.out.database.mapper;

import com.api.venta.domain.models.Venta;
import com.api.venta.infrastructure.adapters.out.database.entities.VentaEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-19T11:29:21-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class VentaMapperImpl implements VentaMapper {

    @Override
    public VentaEntity toEntity(Venta venta) {
        if ( venta == null ) {
            return null;
        }

        VentaEntity ventaEntity = new VentaEntity();

        ventaEntity.setId( venta.getId() );
        ventaEntity.setSellDate( venta.getSellDate() );
        ventaEntity.setMedicineID( venta.getMedicineID() );
        ventaEntity.setAmount( venta.getAmount() );
        ventaEntity.setValue( venta.getValue() );
        ventaEntity.setTotal( venta.getTotal() );

        return ventaEntity;
    }

    @Override
    public Venta toModel(VentaEntity ventaEntity) {
        if ( ventaEntity == null ) {
            return null;
        }

        Venta venta = new Venta();

        venta.setId( ventaEntity.getId() );
        venta.setSellDate( ventaEntity.getSellDate() );
        venta.setMedicineID( ventaEntity.getMedicineID() );
        venta.setAmount( ventaEntity.getAmount() );
        venta.setValue( ventaEntity.getValue() );
        venta.setTotal( ventaEntity.getTotal() );

        return venta;
    }

    @Override
    public List<Venta> toModel(List<VentaEntity> ventaEntities) {
        if ( ventaEntities == null ) {
            return null;
        }

        List<Venta> list = new ArrayList<Venta>( ventaEntities.size() );
        for ( VentaEntity ventaEntity : ventaEntities ) {
            list.add( toModel( ventaEntity ) );
        }

        return list;
    }
}
