package com.api.venta.infrastructure.adapters.out.database.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Table(name = "VENTA")
@SequenceGenerator(name = "venta_seq", sequenceName = "venta_seq", initialValue = 1, allocationSize = 1)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VentaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "venta_seq")
    @Column(name = "ID", columnDefinition = "NUMBER(10)", nullable = false)
    private Long id;

    @Column(name = "FECHA_HORA", columnDefinition = "DATE", nullable = false)
    private LocalDate sellDate;

    @Column(name = "MEDICAMENTO_ID", columnDefinition = "NUMBER(10)", nullable = false)
    private Long medicineID;

    @Column(name = "CANTIDAD", columnDefinition = "NUMBER(6)", nullable = false)
    private Long amount;

    @Column(name = "VALOR_UNITARIO", columnDefinition = "NUMBER(12)", nullable = false)
    private Long value;

    @Column(name = "VALOR_TOTAL", columnDefinition = "NUMBER(12)", nullable = false)
    private Long total;
 }
