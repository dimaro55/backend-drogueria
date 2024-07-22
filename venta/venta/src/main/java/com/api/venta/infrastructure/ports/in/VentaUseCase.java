package com.api.venta.infrastructure.ports.in;

import com.api.venta.domain.models.Venta;

import java.time.LocalDate;
import java.util.List;

public interface VentaUseCase {

    List<Venta> findAll();
    Venta save(Venta venta);

    List<Venta> findByDate(LocalDate dateStart, LocalDate dateEnd);



}
