package com.drogueria.api.application.usecases;

import com.drogueria.api.domain.models.Medicine;
import com.drogueria.api.infrastructure.ports.in.MedicineUseCase;
import com.drogueria.api.infrastructure.ports.out.database.MedicinePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class MedicineUseCaseImpl implements MedicineUseCase {
    private final MedicinePort medicinePort;

    @Override
    public List<Medicine> findAll(String name) {
        return medicinePort.findAll( name);
    }

    @Override
    public Medicine save(Medicine medicine) {
        return medicinePort.save(medicine);
    }

    @Override
    public void delete(Long id) {
        medicinePort.delete(id);
    }

    @Override
    public Medicine update(Medicine medicine) {
        Medicine medicineGet = medicinePort.findById(medicine.getId());
        if (medicine.getName()!=null){
            medicineGet.setName(medicine.getName());
        }
        if (medicine.getLaboratory()!=null){
            medicineGet.setLaboratory(medicine.getLaboratory());
        }
        if (medicine.getExpiration_date()!=null){
            medicineGet.setExpiration_date(medicine.getExpiration_date());
        }
        if (medicine.getProduction_date()!=null){
            medicineGet.setProduction_date(medicine.getProduction_date());
        }
        if (medicine.getStock()!=null){
            medicineGet.setStock(medicine.getStock());
        }
        if (medicine.getValue()!=null){
            medicineGet.setValue(medicine.getValue());
        }

        return medicinePort.save(medicineGet);
    }
}
