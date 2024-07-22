package com.api.venta.infrastructure.adapters.in.rest.controller.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VentaResponse {

    private Long id;

    private LocalDate sellDate;

    private Long medicineID;

    private Long amount;

    private Long value;

    private Long total;
}