package com.drogueria.api.infrastructure.adapters.in.rest.controller;

import com.drogueria.api.infrastructure.adapters.in.rest.configuration.MedicineApi;
import com.drogueria.api.infrastructure.adapters.in.rest.controller.request.MedicineRequest;
import com.drogueria.api.infrastructure.adapters.in.rest.controller.response.MedicineResponse;
import com.drogueria.api.infrastructure.adapters.in.rest.mapper.MedicineMapperApi;
import com.drogueria.api.infrastructure.ports.in.MedicineUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("${request-mapping.controller.medicamentos}")

public class MedicineController implements MedicineApi {

    private final MedicineMapperApi medicineMapperApi;


    private  final MedicineUseCase medicineUseCase;

    public MedicineController(MedicineMapperApi medicineMapperApi, MedicineUseCase medicineUseCase) {
        this.medicineMapperApi = medicineMapperApi;
        this.medicineUseCase = medicineUseCase;
    }

    @Override
    public ResponseEntity<List<MedicineResponse>> findAll(String name) {
        return new ResponseEntity<>(medicineMapperApi.toResponse(medicineUseCase.findAll(name)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<MedicineResponse> save( MedicineRequest medicineRequest) {
        return new ResponseEntity<>(medicineMapperApi.toResponse(medicineUseCase.save(medicineMapperApi.toModel(medicineRequest))), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        this.medicineUseCase.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<MedicineResponse> update(MedicineRequest medicineRequest) {
        return new ResponseEntity<>(medicineMapperApi.toResponse(medicineUseCase.update(medicineMapperApi.toModel(medicineRequest))), HttpStatus.OK);
    }
}
