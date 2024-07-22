package com.api.venta.infrastructure.adapters.in.rest.controller;


import com.api.venta.infrastructure.adapters.in.rest.configuration.VentaApi;
import com.api.venta.infrastructure.adapters.in.rest.controller.request.VentaRequest;
import com.api.venta.infrastructure.adapters.in.rest.controller.response.VentaResponse;
import com.api.venta.infrastructure.adapters.in.rest.mapper.VentaMapperApi;
import com.api.venta.infrastructure.ports.in.VentaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("${request-mapping.controller.ventas}")
@RequiredArgsConstructor
public class VentaController implements VentaApi {

    private final VentaMapperApi ventaMapperApi;
    private final VentaUseCase ventaUseCase;

    @Override
    public ResponseEntity<List<VentaResponse>> findAll() {
        return new ResponseEntity<>(ventaMapperApi.toResponse(ventaUseCase.findAll()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<VentaResponse> save(VentaRequest ventaRequest) {
        return new ResponseEntity<>(ventaMapperApi.toResponse(ventaUseCase.save(ventaMapperApi.toModel(ventaRequest))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<VentaResponse>> findByDate(LocalDate dateStart, LocalDate dateEnd) {
        return new ResponseEntity<>(ventaMapperApi.toResponse(ventaUseCase.findByDate(dateStart, dateEnd)), HttpStatus.OK);
    }


}
