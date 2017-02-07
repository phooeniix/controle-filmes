/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.ppoo.servicos;

import br.ufla.dcc.ppoo.dao.FilmeDAO;
import br.ufla.dcc.ppoo.dao.lista.FilmeDAOLista;
import br.ufla.dcc.ppoo.i18n.I18N;
import br.ufla.dcc.ppoo.modelo.Filme;
import br.ufla.dcc.ppoo.seguranca.SessaoUsuario;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author alexandre.carvalho
 */
public class GerenciadorFilmes {
     private final FilmeDAO repositorioFilme;
    // atributo para controle de sessão (autenticação do usuário)
    private final SessaoUsuario sessaoUsuario;
    
    public GerenciadorFilmes(){
        repositorioFilme = FilmeDAOLista.obterInstancia();
        sessaoUsuario    = SessaoUsuario.obterInstancia();
    }
    public void cadastrarFilme(Filme f) throws Exception{
       Filme ret = repositorioFilme.getMovieByName(f.getName());
        if (ret != null) {
            throw new Exception(I18N.obterErroFilmeJaCadastrado());
        }
        repositorioFilme.addFilme(f);
        JOptionPane.showMessageDialog(null, I18N.sucessoOperacao());
    }
   public List<Filme> listaFilme(){
       return repositorioFilme.listFilme();
   }
}