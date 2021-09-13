package com.projetoWEG.domain.service;

import com.projetoWEG.api.assembler.RequisicaoAssembler;
import com.projetoWEG.api.model.dto.RequisicaoDTO;
import com.projetoWEG.api.model.input.RequisicaoInputDTO;
import com.projetoWEG.domain.model.Requisicao;
import com.projetoWEG.domain.repository.RequisicaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class RequisicaoService {

    private RequisicaoAssembler requisicaoAssembler;
    private RequisicaoRepository requisicaoRepository;

    public RequisicaoDTO gerarRequisicao(RequisicaoInputDTO requisicaoInputDTO) {

        Requisicao requisicao = requisicaoAssembler.toEntity(requisicaoInputDTO);

        requisicao.setDataRequisicao(LocalDateTime.now());
        requisicaoRepository.save(requisicao);

        return requisicaoAssembler.toModel(requisicao);
    }
}