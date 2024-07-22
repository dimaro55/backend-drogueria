package com.api.venta.infrastructure.adapters.out.database;

import com.api.venta.domain.models.Venta;
import com.api.venta.infrastructure.ports.VentaPort;
import com.api.venta.infrastructure.ports.out.database.mapper.VentaMapper;
import com.api.venta.infrastructure.ports.out.database.repository.VentaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@RequiredArgsConstructor
public class VentaAdapter implements VentaPort {

    private final VentaRepository ventaRepository;

    private final VentaMapper ventaMapper;

    @Override
    public List<Venta> findAll() {
        return ventaMapper.toModel(ventaRepository.findAll());

    }

    @Override
    public Venta save(Venta venta) {
        return ventaMapper.toModel(ventaRepository.save(ventaMapper.toEntity(venta)));
    }

    @Override
    public List<Venta> findByDate(LocalDate dateStart, LocalDate dateEnd) {
        return ventaMapper.toModel(ventaRepository.getVentaByDate(dateStart, dateEnd));
    }

}
