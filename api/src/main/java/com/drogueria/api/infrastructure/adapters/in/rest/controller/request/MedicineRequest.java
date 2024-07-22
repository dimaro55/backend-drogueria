package com.drogueria.api.infrastructure.adapters.in.rest.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MedicineRequest {

    private Long id;
    private String name;

    private String laboratory;

    private LocalDate production_date;

    private LocalDate expiration_date;

    private Long stock;

    private Long value;


}
