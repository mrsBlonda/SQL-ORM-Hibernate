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
    EntityManager entityManager;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Customers customers1 = new Customers(1, "Anna", "Prohvataeva", 27, "12345");
        Customers customers2 = new Customers(2, "Maksim", "Prohvataev", 40, "12345");
        Customers customers3 = new Customers(3, "Alina", "Perepelova", 18, "12345");
        Customers customers4 = new Customers(4, "Ekaterina", "Prohvataeva", 25, "12345");
        Customers customers5 = new Customers(5, "Matvey", "Prohvataev", 30, "12345");

//        Orders orders1 = new Orders(1, "01.03.2022", "Cupcakes", 20, customers1);
//        Orders orders2 = new Orders(2, "01.07.2022", "Milk", 20, customers5);
//        Orders orders3 = new Orders(3, "01.08.2022", "Water", 20, customers5);

        entityManager.persist(customers1);
//        entityManager.persist(customers2);
//        entityManager.persist(customers3);
//        entityManager.persist(customers4);
//        entityManager.persist(customers5);
//        entityManager.persist(orders1);
//        entityManager.persist(orders2);
//        entityManager.persist(orders3);


    }
}
