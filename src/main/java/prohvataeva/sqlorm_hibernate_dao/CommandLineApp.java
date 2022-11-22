package prohvataeva.sqlorm_hibernate_dao;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import prohvataeva.sqlorm_hibernate_dao.entity.NameAndSurnameID;
import prohvataeva.sqlorm_hibernate_dao.entity.Persons;
import prohvataeva.sqlorm_hibernate_dao.repository.PersonsJPARepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CommandLineApp implements CommandLineRunner {

    private final PersonsJPARepository personsJPARepository;
    @Override
    @Transactional
    public void run(String... args) throws Exception {

        NameAndSurnameID onePeople = new NameAndSurnameID("Anna", "Prohvataeva", 27);
        NameAndSurnameID twoPeople = new NameAndSurnameID("Maksim", "Prohvataev", 40);
        NameAndSurnameID threePeople = new NameAndSurnameID("Elena", "Volkova", 28);
        NameAndSurnameID fourPeople = new NameAndSurnameID("Alina", "Perepelova", 18);
        NameAndSurnameID fivePeople = new NameAndSurnameID("Ekaterina", "Prohvataeva", 24);
        NameAndSurnameID sixPeople = new NameAndSurnameID("Lavrentiy", "Dzuba", 24);

        List<Persons> personsList = new ArrayList<>();
        personsList.add(new Persons(1, onePeople, "12345", "Moscow"));
        personsList.add(new Persons(2, twoPeople, "12345", "Moscow"));
        personsList.add(new Persons(3, threePeople, "12345", "Saransk"));
        personsList.add(new Persons(4, fourPeople, "12345", "Naro-Fominsk"));
        personsList.add(new Persons(5, fivePeople, "12345", "Samara"));
        personsList.add(new Persons(6, sixPeople, "12345", "Samara"));



        personsJPARepository.saveAll(personsList);


        }
    }

