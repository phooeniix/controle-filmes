/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.ppoo.dao;

import br.ufla.dcc.ppoo.modelo.Filme;
import java.util.List;

/**
 *
 * @author alexandre.carvalho
 */
public interface FilmeDAO {
    
    public void addFilme(Filme filme);
    public void editFilme(Filme filme);
    public void removeFilme(int cod);
    public List<Filme> listFilme();
    public void addListFilme(Filme filme);

    public Filme getMovieByName(String name);
}
