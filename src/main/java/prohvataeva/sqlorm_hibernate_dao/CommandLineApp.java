package prohvataeva.sqlorm_hibernate_dao;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import prohvataeva.sqlorm_hibernate_dao.entity.Customers;
import prohvataeva.sqlorm_hibernate_dao.entity.Orders;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
@RequiredArgsConstructor
public class CommandLineApp implements CommandLineRunner {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Customers customers1 = new Customers("Anna", "Prohvataeva", 27, "12345");
        Customers customers2 = new Customers("Maksim", "Prohvataev", 40, "12345");
        Customers customers3 = new Customers("Alina", "Perepelova", 18, "12345");
        Customers customers4 = new Customers("Ekaterina", "Prohvataeva", 25, "12345");
        Customers customers5 = new Customers("Matvey", "Prohvataev", 30, "12345");

        Orders orders1 = new Orders("01.03.2022", "Cupcakes", 20, customers1);
        Orders orders2 = new Orders( "01.07.2022", "Milk", 20, customers5);
        Orders orders3 = new Orders("01.08.2022", "Water", 20, customers5);
        Orders orders4 = new Orders("01.08.2022", "Cake", 20, customers3);
        Orders orders5 = new Orders("01.08.2022", "Soda", 20, customers3);
        Orders orders6 = new Orders("01.08.2022", "Pasta", 20, customers3);

        entityManager.persist(customers1);
        entityManager.persist(customers2);
        entityManager.persist(customers3);
        entityManager.persist(customers4);
        entityManager.persist(customers5);
        entityManager.persist(orders1);
        entityManager.persist(orders2);
        entityManager.persist(orders3);
        entityManager.persist(orders4);
        entityManager.persist(orders5);
        entityManager.persist(orders6);



    }
}
