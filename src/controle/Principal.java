
package controle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {
    

    public static void main(String[] args) {
    EntityManagerFactory factory =
    Persistence.createEntityManagerFactory("ProjetoTdsiPU");
 
    EntityManager manager = factory.createEntityManager();
    }
    
}
