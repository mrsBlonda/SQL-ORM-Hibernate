package prohvataeva.sqlorm_hibernate_dao;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import prohvataeva.sqlorm_hibernate_dao.entity.NameAndSurnameID;
import prohvataeva.sqlorm_hibernate_dao.entity.Persons;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CommandLineApp implements CommandLineRunner {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional
    public void run(String... args) throws Exception {

        NameAndSurnameID onePeople = new NameAndSurnameID("Anna", "Prohvataeva", 27);
        NameAndSurnameID twoPeople = new NameAndSurnameID("Maksim", "Prohvataev", 40);
        NameAndSurnameID threePeople = new NameAndSurnameID("Elena", "Volkova", 28);
        NameAndSurnameID fourPeople = new NameAndSurnameID("Alina", "Perepelova", 18);
        NameAndSurnameID fivePeople = new NameAndSurnameID("Ekaterina", "Prohvataeva", 24);

        Persons person1 = new Persons(1, onePeople, "12345", "Moscow");
        Persons person2 = new Persons(2, twoPeople, "12345", "Moscow");
        Persons person3 = new Persons(3, threePeople, "12345", "Saransk");
        Persons person4 = new Persons(4, fourPeople, "12345", "Naro-Fominsk");
        Persons person5 = new Persons(5, fivePeople, "12345", "Samara");
        entityManager.persist(person1);
        entityManager.persist(person2);
        entityManager.persist(person3);
        entityManager.persist(person4);
        entityManager.persist(person5);

        }
    }

