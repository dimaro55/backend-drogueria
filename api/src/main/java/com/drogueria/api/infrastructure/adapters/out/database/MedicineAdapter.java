package com.drogueria.api.infrastructure.adapters.out.database;

import com.drogueria.api.domain.models.Medicine;
import com.drogueria.api.infrastructure.adapters.out.database.entities.MedicineEntity;
import com.drogueria.api.infrastructure.ports.out.database.MedicinePort;
import com.drogueria.api.infrastructure.ports.out.database.mapper.MedicineMapper;
import com.drogueria.api.infrastructure.ports.out.database.repository.MedicineRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class MedicineAdapter implements MedicinePort {

    private final MedicineRepository medicineRepository;

    private final MedicineMapper medicineMapper;

    public MedicineAdapter(MedicineRepository medicineRepository, MedicineMapper medicineMapper) {
        this.medicineRepository = medicineRepository;
        this.medicineMapper = medicineMapper;
    }

    @Override
    public List<Medicine> findAll(String name) {
        return medicineMapper.toModel(medicineRepository.getMedicineByName(name));
    }

    @Override
    public Medicine save(Medicine medicine) {
        return medicineMapper.toModel(medicineRepository.save(medicineMapper.toEntity(medicine)));
    }

    @Override
    public void delete(Long id) {
        MedicineEntity medicineEntity = medicineRepository.findById(id).orElse(null);
        medicineRepository.delete(medicineEntity);
    }

    @Override
    public Medicine findById(Long id) {
        return this.medicineMapper.toModel(this.medicineRepository.findById(id).orElse(null));
    }


}
