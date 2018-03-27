package classes;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Сергей on 11.07.2016.
 */
@WebServlet("/get")
public class MyServlet extends HttpServlet {
    EntityManager em = Persistence.createEntityManagerFactory("car").createEntityManager();

    Car car;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EntityTransaction tx = em.getTransaction();
        try {
            car = new Car(Integer.valueOf(req.getParameter("id")), req.getParameter("pd"), req.getParameter("qd"));
        } catch (NumberFormatException e) {
            resp.sendRedirect("error.jsp");
        }
        if (car != null) {
            tx.begin();
            em.persist(car);
            tx.commit();


            req.setAttribute("model", car.getModel());
            req.setAttribute("color", car.getColor());
            req.setAttribute("id", car.getId());
            req.getRequestDispatcher("1.jsp").forward(req, resp);
        }
    }
}

////        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
//
//        Car car = em.find(Car.class, 1);
//        System.out.println(car);
////        SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//        String string1 = req.getParameter("id");
//        String string2 = req.getParameter("pd");
//        String string3 = req.getParameter("qd");
//        if (string1 != null && !string1.equals("")) {
//            Integer id = Integer.valueOf(string1);
//            param = new CarDAO().selectById(id);
//            req.setAttribute("model", car.getModel());
//            req.setAttribute("color", car.getColor());
//            req.setAttribute("id", car.getId());
//            req.getRequestDispatcher("1.jsp").forward(req, resp);
//        } else if (string2 != null && !string2.equals("")) {
//            param = new CarDAO().selectByModel(string2);
//            req.setAttribute("model", param.getModel());
//            req.setAttribute("color", param.getColor());
//            req.setAttribute("id", param.getId());
//            req.getRequestDispatcher("1.jsp").forward(req, resp);
//        } else if (string3 != null && !string3.equals("")) {
//            param = new CarDAO().selectByColor(string3);
//            req.setAttribute("model", param.getModel());
//            req.setAttribute("color", param.getColor());
//            req.setAttribute("id", param.getId());
//            req.getRequestDispatcher("1.jsp").forward(req, resp);
//        } else {
//            resp.sendRedirect("error.jsp");
//        }
