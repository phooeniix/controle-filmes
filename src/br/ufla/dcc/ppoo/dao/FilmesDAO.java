/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.ppoo.dao;
import br.ufla.dcc.ppoo.modelo.Filme_old;

/**
 *
 * @author phoenix
 */
public interface FilmesDAO {


    public void adicionarFilme(Filme_old filme);
    public void editarFilme(Filme_old filme);

}
