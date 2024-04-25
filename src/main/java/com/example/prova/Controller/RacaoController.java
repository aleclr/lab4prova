package com.example.prova.Controller;

import java.util.List;
import com.example.prova.Entity.Racao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.prova.Service.RacaoService;

@RestController
public class RacaoController {
    
    @Autowired
    private RacaoService racaoService;

    @GetMapping("/racoes")
    public List<Racao> buscarTodasRacoes() {
        return racaoService.buscarTodos();
    };

    @GetMapping("/racoes/criterios")
    public List<Racao> buscarCriterio(@RequestParam Float QuantidadeEstoque, @RequestParam Integer Nota) {
        return racaoService.buscaRacaoPorCriterios(QuantidadeEstoque, Nota);
    };

    @PostMapping
    public Racao novaRacao(@RequestBody Racao racao) {
        return racaoService.novaRacao(racao);
    }

}
