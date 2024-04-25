package com.example.prova.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.LinkedList;

import com.example.prova.Entity.Racao;

public interface RacaoRepository extends JpaRepository<Racao, Long> {
    
    LinkedList<Racao> findByQuantidadeEstoqueLessThanAndNotaGreaterThan (Float QuantidadeEstoque, Integer Nota);

}
