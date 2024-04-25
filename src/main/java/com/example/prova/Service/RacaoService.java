package com.example.prova.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prova.Entity.Racao;
import com.example.prova.Repository.RacaoRepository;

@Service
public class RacaoService {
    
    @Autowired
    private RacaoRepository racaoRepository;

    public List<Racao> buscarTodos() {
        return racaoRepository.findAll();
    };

    public Racao novaRacao(Racao racao) {
        if ((racao == null)) {
            throw new IllegalArgumentException("Racao não especificada!");
        } else if ((racao.getDataHoraUltimaCompra() == null)) {
            racao.setDataHoraUltimaCompra(LocalDateTime.now());
        }
        return racaoRepository.save(racao);
    };

    public List<Racao> buscaRacaoPorCriterios(Float quantidadeEstoque, Integer nota) {
        return racaoRepository.findByquantidadeEstoqueLessThanAndnotaGreaterThan(quantidadeEstoque, nota);
    };

}
