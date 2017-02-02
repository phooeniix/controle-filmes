
package br.ufla.dcc.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceSingleton {

    private static final String PERSISTENCEUNIT = "controle-filmesPU";
    
    private static PersistenceSingleton instance;

    private EntityManagerFactory emf;

    private PersistenceSingleton() {
        
    }

    public static PersistenceSingleton getInstance() {
        if(instance == null)
            instance = new PersistenceSingleton();
        
        return instance;
    }


    public EntityManagerFactory getEntityManagerFactory() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTENCEUNIT);
        }
       
        return emf;
    }   
}
