package com.example.prova.Entity;

import java.time.LocalDateTime;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rac_racao")
public class Racao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rac_id")
    private Long id;

    @Column(name = "rac_marca")
    private String marca;

    @Column(name = "rac_data_hora_ultima_compra")
    private LocalDateTime dataHoraUltimaCompra;

    @Column(name = "rac_quantidade_estoque")
    private Float quantidadeEstoque;

    @Column(name = "rac_nota")
    private Integer nota;

}
