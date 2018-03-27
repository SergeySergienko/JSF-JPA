package classes;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * Created by Сергей on 06.09.2016.
 */
public class Test_JSF_JPA {
    public static void main(String[] args) {
        EntityManager em = Util.getInstance().getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Car car = new Car(8, "Nissan", "pink");
        em.persist(car);
        tx.commit();
        System.out.println(car);

    }
}
