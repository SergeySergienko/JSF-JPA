package classes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Сергей on 06.09.2016.
 */
public class Util {
    private static Util instance = new Util();
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("carUnit");
    public static Util getInstance() {
        return instance;
    }
    public static EntityManager getEntityManager(){
        return factory.createEntityManager();
    }


    private Util() {
    }
}
