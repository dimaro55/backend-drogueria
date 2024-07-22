package com.drogueria.api.domain.models;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Medicine {

    private Long id;

    private String name;

    private String laboratory;

    private LocalDate production_date;

    private LocalDate expiration_date;

    private Long stock;

    private Long value;
}
