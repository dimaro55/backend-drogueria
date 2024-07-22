package com.drogueria.api.infrastructure.adapters.in.rest.configuration;

import com.drogueria.api.infrastructure.adapters.in.rest.controller.request.MedicineRequest;
import com.drogueria.api.infrastructure.adapters.in.rest.controller.response.MedicineResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface MedicineApi {
    @GetMapping()
    ResponseEntity<List<MedicineResponse>> findAll(String name);

    @PostMapping()
    ResponseEntity<MedicineResponse> save(@RequestBody MedicineRequest medicineRequest);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);

    @PutMapping()
    ResponseEntity<MedicineResponse> update(@RequestBody MedicineRequest medicineRequest);
}
