package com.api.venta.application.usecases;

import com.api.venta.domain.models.Venta;
import com.api.venta.infrastructure.ports.VentaPort;
import com.api.venta.infrastructure.ports.in.VentaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
@RequiredArgsConstructor
public class VentaUseCaseImpl implements VentaUseCase{

    private final VentaPort ventaPort;
    @Override
    public List<Venta> findAll() {
        return ventaPort.findAll();
    }

    @Override
    public Venta save(Venta venta) {
        return ventaPort.save(venta);
    }

    @Override
    public List<Venta> findByDate(LocalDate dateStart, LocalDate dateEnd) {
        return ventaPort.findByDate(dateStart, dateEnd);
    }
}
