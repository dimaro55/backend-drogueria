package com.drogueria.api.infrastructure.ports.out.database;

import com.drogueria.api.domain.models.Medicine;

import java.util.List;

public interface MedicinePort {
    List<Medicine> findAll(String name);
    Medicine save(Medicine medicine);

    void delete(Long id);
    Medicine findById(Long id);
}
