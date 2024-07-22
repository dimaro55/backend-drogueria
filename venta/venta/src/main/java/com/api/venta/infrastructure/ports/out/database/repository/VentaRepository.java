package com.api.venta.infrastructure.ports.out.database.repository;

import com.api.venta.infrastructure.adapters.out.database.entities.VentaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface VentaRepository extends JpaRepository<VentaEntity, Long> {

    @Query("SELECT V FROM VentaEntity V WHERE :dateStart IS NULL OR (V.sellDate) >= :dateStart AND :dateEnd IS NULL OR (V.sellDate) <= :dateEnd")
    List<VentaEntity> getVentaByDate(@Param("dateStart") LocalDate dateStart, @Param("dateEnd") LocalDate dateEnd );

}
