package com.projetoWEG.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;

//@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Aprovacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    Long id;

    @Valid
    @NotNull
    Date data;

    @Valid
    @NotNull
    String nome_fornecedor;

    @Valid
    @NotNull
    Apontamento apontamento;

    @Valid
    @NotNull
    double valor_hora;

    @Valid
    @NotNull
    int horas_aprovadas;
}