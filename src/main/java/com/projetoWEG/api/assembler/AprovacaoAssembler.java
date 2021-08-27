package com.projetoWEG.api.assembler;

import com.projetoWEG.api.model.dto.AprovacaoDTO;
import com.projetoWEG.api.model.dto.ConsultorDTO;
import com.projetoWEG.api.model.input.AprovacaoInput;
import com.projetoWEG.domain.model.Aprovacao;
import com.projetoWEG.domain.model.Consultor;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class AprovacaoAssembler {

    private ModelMapper modelMapper;

    public Aprovacao toEntity(AprovacaoInput aprovacaoInput) {
        return modelMapper.map(aprovacaoInput, Aprovacao.class);
    }
    public AprovacaoDTO toModel(Aprovacao aprovacao) {
        return modelMapper.map(aprovacao, AprovacaoDTO.class);
    }
    public List<AprovacaoDTO> toModelCollection(List<Aprovacao> aprovacoes) {
        return aprovacoes.stream().map(this::toModel).collect(Collectors.toList());
    }
}
