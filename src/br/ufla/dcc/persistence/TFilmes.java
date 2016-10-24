/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.persistence;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author phoenix
 */
@Entity
@Table(name = "t_filmes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TFilmes.findAll", query = "SELECT t FROM TFilmes t"),
    @NamedQuery(name = "TFilmes.findByCod", query = "SELECT t FROM TFilmes t WHERE t.cod = :cod"),
    @NamedQuery(name = "TFilmes.findByNome", query = "SELECT t FROM TFilmes t WHERE t.nome = :nome"),
    @NamedQuery(name = "TFilmes.findByGenero", query = "SELECT t FROM TFilmes t WHERE t.genero = :genero"),
    @NamedQuery(name = "TFilmes.findByAno", query = "SELECT t FROM TFilmes t WHERE t.ano = :ano"),
    @NamedQuery(name = "TFilmes.findByDuracao", query = "SELECT t FROM TFilmes t WHERE t.duracao = :duracao"),
    @NamedQuery(name = "TFilmes.findByDescricao", query = "SELECT t FROM TFilmes t WHERE t.descricao = :descricao")})
public class TFilmes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod")
    private Integer cod;
    @Column(name = "nome")
    private String nome;
    @Column(name = "genero")
    private String genero;
    @Column(name = "ano")
    private Integer ano;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "duracao")
    private Double duracao;
    @Column(name = "descricao")
    private String descricao;

    public TFilmes() {
    }

    public TFilmes(Integer cod) {
        this.cod = cod;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod != null ? cod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TFilmes)) {
            return false;
        }
        TFilmes other = (TFilmes) object;
        if ((this.cod == null && other.cod != null) || (this.cod != null && !this.cod.equals(other.cod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.ufla.dcc.persistence.TFilmes[ cod=" + cod + " ]";
    }
    
}
