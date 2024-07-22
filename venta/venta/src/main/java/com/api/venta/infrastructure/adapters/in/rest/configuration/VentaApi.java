package com.api.venta.infrastructure.adapters.in.rest.configuration;


import com.api.venta.infrastructure.adapters.in.rest.controller.request.VentaRequest;
import com.api.venta.infrastructure.adapters.in.rest.controller.response.VentaResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

public interface VentaApi {

    @GetMapping()
    ResponseEntity<List<VentaResponse>> findAll();

    @PostMapping()
    ResponseEntity<VentaResponse> save(@RequestBody VentaRequest ventaRequest);

    @GetMapping("/filtro")
    ResponseEntity<List<VentaResponse>> findByDate( LocalDate dateStart,LocalDate dateEnd);
}
