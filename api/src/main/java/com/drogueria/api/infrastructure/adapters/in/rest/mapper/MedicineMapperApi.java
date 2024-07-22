package com.drogueria.api.infrastructure.adapters.in.rest.mapper;

import com.drogueria.api.domain.models.Medicine;
import com.drogueria.api.infrastructure.adapters.in.rest.controller.request.MedicineRequest;
import com.drogueria.api.infrastructure.adapters.in.rest.controller.response.MedicineResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "Spring")
public interface MedicineMapperApi {


    MedicineResponse toResponse(Medicine medicine);
    List<MedicineResponse> toResponse(List<Medicine> medicines);

    Medicine toModel (MedicineRequest medicineRequest);
}
