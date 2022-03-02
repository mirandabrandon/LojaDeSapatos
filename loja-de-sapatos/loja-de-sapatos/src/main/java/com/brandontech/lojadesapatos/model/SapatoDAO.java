package com.brandontech.lojadesapatos.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "Sapato")
public class SapatoDAO {

    public SapatoDAO(){}

    public SapatoDAO(Long id, String modelo, Integer tamanho, String categoria, String cor, BigDecimal preco, String marca, LocalDateTime dataDecadastro, Integer quantidadeEmEstoque, String descricao) {
        this.id = id;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.categoria = categoria;
        this.cor = cor;
        this.preco = preco;
        this.marca = marca;
        this.dataDecadastro = dataDecadastro;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.descricao = descricao;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 50)
    private String modelo;
    @Column(nullable = false, length = 10)
    private Integer tamanho;
    @Column(nullable = true,length = 50)
    private String categoria;
    @Column(nullable = true,length = 50)
    private String cor;
    @Column(nullable = false)
    private BigDecimal preco;
    @Column(nullable = true,length = 50   )
    private String marca;
    @Column(nullable = false)
    private LocalDateTime dataDecadastro;
    @Column(nullable = false)
    private Integer quantidadeEmEstoque;
    @Column(nullable = true, length = 100)
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDateTime getDataDecadastro() {
        return dataDecadastro;
    }

    public void setDataDecadastro(LocalDateTime dataDecadastro) {
        this.dataDecadastro = dataDecadastro;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }




}
