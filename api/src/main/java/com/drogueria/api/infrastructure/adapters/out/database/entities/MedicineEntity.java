package com.drogueria.api.infrastructure.adapters.out.database.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "MEDICAMENTO")
@SequenceGenerator(name = "medicamento_seq", sequenceName = "medicamento_seq", initialValue = 1, allocationSize = 1)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MedicineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medicamento_seq")
    @Column(name = "ID", columnDefinition = "NUMBER(10)", nullable = false)
    private Long id;
    @Column(name = "NOMBRE", columnDefinition = "VARCHAR2(30)", nullable = false)
    private String name;
    @Column(name = "LABORATORIO", columnDefinition = "VARCHAR2(50)", nullable = false)
    private String laboratory;
    @Column(name = "FECHA_FABRICACION", columnDefinition = "DATE", nullable = false)
    private LocalDate production_date;
    @Column(name = "FECHA_VENCIMIENTO", columnDefinition = "DATE", nullable = false)
    private LocalDate expiration_date;
    @Column(name = "CANTIDAD", columnDefinition = "NUMBER(6)", nullable = false)
    private Long stock;
    @Column(name = "VALOR", columnDefinition = "NUMBER(12)", nullable = false)
    private Long value;


}
