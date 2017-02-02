/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.ppoo.dao.lista;
import br.ufla.dcc.ppoo.modelo.Filme_old;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author phoenix
 */
public class FilmeDAOLista {

  // Criando instancia da classe
  private static FilmeDAOLista instancia;

  //criando uma lista em memória dos filmes cadastrados
  private List<Filme_old> listaFilme;

  public FilmeDAOLista(){
    //Criando uma lista de objetos filmes filmes
    listaFilme = new ArrayList<Filme_old>();
    listaFilme.add(new Filme_old("A era do gelo","Animação", 2001, 120, "Uma incrível aventura pelo mundo gelado para um resgate de um bebê"));

  }
  public static FilmeDAOLista obterInstancia(){
    if(instancia==null) instancia = new FilmeDAOLista();

    return instancia;
  }
  
  public List<Filme_old> obterLista(){
      return listaFilme;
  }
  
/*
  * Criando métodos para realizar o crud na tabela
  * Esse método recebe um objeto com todas propriedades previamente setadas
  * pelo usuário no momento que clicar no botão de salvar
  *
  *
  *
  */
  public void adicionarFilme(Filme_old filme) {
      listaFilme.add(filme);
  }
  public void EditarFilme(Filme_old filme) {
      listaFilme.add(filme);
  }
  public void RemoverFilme(Filme_old filme) {
      listaFilme.add(filme);
  }
  public Filme_old ListarFilme(){
      return (Filme_old) listaFilme;
  }


}
