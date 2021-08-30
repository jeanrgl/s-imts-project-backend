package com.projetoWEG.api.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class AlocacaoDTO {

    private ConsultorDTO idConsultor;

    private ProjetoDTO idProjeto;

    @Valid
    @NotBlank
    private String skill;

    @Valid
    @NotNull
    @Column(name = "horas_total")
    private int horasTotal;
}
