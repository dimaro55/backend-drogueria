package com.drogueria.api.infrastructure.ports.in;

import com.drogueria.api.domain.models.Medicine;

import java.util.List;

public interface MedicineUseCase {
    List<Medicine> findAll(String name);
    Medicine save(Medicine medicine);

    void delete(Long id);

    Medicine update(Medicine medicine);
}
