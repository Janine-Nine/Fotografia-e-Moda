package com.fotomoda.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Foto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    private String urlImagem;

    private String categoria;

    private LocalDateTime dataUpload;

    // getters e setters
}