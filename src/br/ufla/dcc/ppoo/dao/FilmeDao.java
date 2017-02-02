/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.ppoo.dao;

import br.ufla.dcc.ppoo.modelo.Filme;

/**
 *
 * @author alexandre.carvalho
 */
public interface FilmeDao {
    
    public void addFilme(Filme filme);
    public void editFilme(Filme filme);
    public void removeFilme(int cod);
    public void listFilme(Filme filme);
    public void addListFilme(Filme filme);
}
