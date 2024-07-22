package com.drogueria.api.infrastructure.ports.out.database.mapper;

import com.drogueria.api.domain.models.Medicine;
import com.drogueria.api.infrastructure.adapters.out.database.entities.MedicineEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "Spring")
public interface MedicineMapper {
    MedicineEntity toEntity(Medicine medicine);
    Medicine toModel(MedicineEntity medicineEntity);
    List<Medicine> toModel(List<MedicineEntity> medicineEntities);
}
