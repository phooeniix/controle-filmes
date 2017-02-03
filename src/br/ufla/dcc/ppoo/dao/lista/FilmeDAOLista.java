/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.ppoo.dao.lista;

import br.ufla.dcc.ppoo.dao.FilmeDAO;
import br.ufla.dcc.ppoo.i18n.I18N;
import br.ufla.dcc.ppoo.modelo.Filme;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author alexandre.carvalho
 */
public class FilmeDAOLista implements FilmeDAO {
     // instância única da classe (Padrão de Projeto Singleton)
    private static FilmeDAOLista instancia;
    private final List<Filme> listaFilme;

    
    
    // lista em em memória dos usuários cadastrados
    

    private FilmeDAOLista() {
        listaFilme = new ArrayList<>();
    }

    @Override
    public void addFilme(Filme filme) {
        try {
            if(JOptionPane.showConfirmDialog(null, I18N.obterConfirmacaoSaida())== 1 ){
                        listaFilme.add(filme);
                        JOptionPane.showMessageDialog(null, "Inserido com Sucesso!");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro entre em contato "
                    + "com o administrador"+ e.getMessage());
        }
    }

    @Override
    public void editFilme(Filme filme) {
        try {
            for(Filme f : listaFilme){
                if(f.getCod()==filme.getCod()){
                    f.setDescription(filme.getDescription());
                    f.setDuration(filme.getDuration());
                    f.setGenre(filme.getGenre());
                    f.setYear(filme.getYear());
                    f.setName(filme.getName());
                }
            }
            JOptionPane.showMessageDialog(null, "Editado com Sucesso!");
        } catch (Exception e) {
        }
    }

    @Override
    public void removeFilme(int cod) {
        try {
            listaFilme.remove(cod);
            JOptionPane.showMessageDialog(null, "Removido com Sucesso");
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Houve um problema entre "
                        + "em contato com o administrador"+ e.getMessage());
        }
        
    }

    @Override
    public List<Filme> listFilme() {
       return listaFilme;
    }

    @Override
    public void addListFilme(Filme filme) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Filme getMovieByName(String name) {
        for (Filme f : listaFilme) {
            if (name.equals(f.getName())) {
                return f;
            }
        }
        return null;
    }
    
    public Filme getMovieByCod(int cod) {
        for (Filme f : listaFilme) {
            if (cod == f.getCod() ) {
                return f;
            }
        }
        return null;
    }
    
    public static FilmeDAO obterInstancia() {
        if (instancia == null) {
            instancia = new FilmeDAOLista();
        }
        return instancia;
    }

}
