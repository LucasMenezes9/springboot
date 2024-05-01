package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
/*
    * Os records são imultaveis.
 */
public record ProductRecordDto(@NotBlank String nome,@NotNull BigDecimal value) {
}
