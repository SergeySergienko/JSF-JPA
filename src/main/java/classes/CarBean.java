package classes;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Сергей on 04.09.2016.
 */
@ManagedBean
@SessionScoped
@Entity
@Table (name = "car")
public class CarBean implements Serializable {
    private final static long version = -7672565361245434323L;
    @Id
    //@GeneratedValue
    private int id;
    private String model;
    private String color;

    public CarBean() {
    }

    public CarBean(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public CarBean(int id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String addConfirmedCar(){
        EntityManager em = Util.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(new CarBean(model, color));
        tx.commit();
        return "done";
    }

    @Override
    public String toString() {
        return "CarBean{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
