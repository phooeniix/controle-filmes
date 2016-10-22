/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.ppoo.modelo;
import java.util.Arrays;

/**
 *
 * @author phoenix
 */
public class Filme {
    /*Criando atributos da classe, nome das variaveis e conteudo da janela de
      conteúdo da janela de filmes.
    */
    private double cod ;
    private String nome;
    private String genero;
    private int ano;
    private double duracao;
    private String descricao;

    /**
     * @return the nome
     */

    public Filme(String nome, String genero, int ano, float duracao, String descricao){
      //pensando na lógica de auto increment para o cod+1 a cada new Filmes
      //this.cod +=1;
      this.nome = nome;
      this.genero = genero;
      this.ano = ano;
      this.duracao = duracao;
      this.descricao = descricao;
    }
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the duracao
     */
    public double getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the cod
     */
    public double getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(double cod) {
        this.cod = cod;
    }

}
