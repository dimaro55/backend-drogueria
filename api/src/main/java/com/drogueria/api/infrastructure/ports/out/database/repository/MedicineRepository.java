package com.drogueria.api.infrastructure.ports.out.database.repository;

import com.drogueria.api.infrastructure.adapters.out.database.entities.MedicineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MedicineRepository extends JpaRepository<MedicineEntity,Long> {

   @Query("SELECT M FROM MedicineEntity M WHERE :name IS NULL OR LOWER(M.name) LIKE CONCAT('%', LOWER(:name), '%') ")
    List<MedicineEntity>  getMedicineByName(@Param("name") String name);
}
