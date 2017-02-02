/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.persistence;

import br.ufla.dcc.persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author phoenix
 */
public class TFilmesJpaController implements Serializable {

    public TFilmesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TFilmes TFilmes) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(TFilmes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TFilmes TFilmes) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TFilmes = em.merge(TFilmes);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = TFilmes.getCod();
                if (findTFilmes(id) == null) {
                    throw new NonexistentEntityException("The tFilmes with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TFilmes TFilmes;
            try {
                TFilmes = em.getReference(TFilmes.class, id);
                TFilmes.getCod();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The TFilmes with id " + id + " no longer exists.", enfe);
            }
            em.remove(TFilmes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TFilmes> findTFilmesEntities() {
        return findTFilmesEntities(true, -1, -1);
    }

    public List<TFilmes> findTFilmesEntities(int maxResults, int firstResult) {
        return findTFilmesEntities(false, maxResults, firstResult);
    }

    private List<TFilmes> findTFilmesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TFilmes.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public TFilmes findTFilmes(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TFilmes.class, id);
        } finally {
            em.close();
        }
    }

    public int getTFilmesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TFilmes> rt = cq.from(TFilmes.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
