package com.projetoWEG.api.controller;

import com.projetoWEG.domain.model.Projeto;
import com.projetoWEG.domain.model.StatusProjeto;
import com.projetoWEG.domain.repository.ProjetoRepository;
import com.projetoWEG.domain.service.ProjetoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    private ProjetoService projetoService;

    @GetMapping
    public List<Projeto> listarProjetos() {
        return projetoService.listarTodos();
    }

    @GetMapping("/{ID}")
    public ResponseEntity<Projeto> listarProjetoId(@PathVariable Long id) {
        return projetoService.listarId(id);
    }
    @GetMapping("/nome/{nome}")
    public ResponseEntity<Projeto> listarProjetoNome(@PathVariable String nome) {
        return projetoService.listarNome(nome);
    }
    @GetMapping("/secao/{secao}")
    public List<Projeto> listarProjetosSecao(@PathVariable String secao) {
        return projetoService.listarSecao(secao);
    }

    @GetMapping("/status/{ID}")
    public List<Projeto> listarProjetosStatus(@PathVariable StatusProjeto status) {
        return projetoService.listarStatus(status);
    }
}