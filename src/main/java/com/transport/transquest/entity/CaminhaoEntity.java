package com.transport.transquest.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "CONTEUDO")
public class CaminhaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CAMINHAO")
    private Long idCaminhao;

    @Column(name = "PLACA")
    private String placa;

    @Column(name = "MARCA")
    private String marca;

    @Column(name = "MODELO")
    private String modelo;

    @Column(name = "ANO")
    private String ano;

    @Column(name = "KILOMETRAGEM")
    private Double kilometragem;

    @Column(name = "ULTIMA_ATUALIZACAO")
    private LocalDateTime ultimaAtualizacao;


}
