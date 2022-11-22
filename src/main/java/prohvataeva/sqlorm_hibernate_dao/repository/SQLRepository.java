package prohvataeva.sqlorm_hibernate_dao.repository;

import org.springframework.stereotype.Repository;
import prohvataeva.sqlorm_hibernate_dao.entity.NameAndSurnameID;
import prohvataeva.sqlorm_hibernate_dao.entity.Persons;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SQLRepository {
    private final PersonsJPARepository personsJPARepository;
    private final NameAndSurnameJPARepository nameAndSurnameJPARepository;
    private List<Persons> personsList = new ArrayList<>();

    public SQLRepository(PersonsJPARepository personsJPARepository, NameAndSurnameJPARepository nameAndSurnameJPARepository) {
        this.personsJPARepository = personsJPARepository;
        this.nameAndSurnameJPARepository = nameAndSurnameJPARepository;
    }

    public List<Persons> getAllPersons() {
        personsList = personsJPARepository.findAll();
        return personsList;
    }

    public List<Persons> getPersonsById(long id) {
        List<Persons> list = getAllPersons();
        List<Persons> listOfPersonsById = new ArrayList<>();
        for (Persons person : list) {
            if(person.getId() == id) {
                listOfPersonsById.add(person);
            }
        }
        return listOfPersonsById;
    }

    public List<Persons> getPersonsByCity(String city) {
        return personsJPARepository.findByCityOfLiving(city);
    }


    public void saveOrUpdatePersons(Persons persons) {
        List<Persons> list = getAllPersons();
        for (Persons person : list) {
            if(persons.getId()==person.getId()) {
                throw new RuntimeException("Такой пользователь уже есть");
            }
            if(persons.getId()==0) {
                throw new RuntimeException("Введите id");
            }
            personsJPARepository.save(persons);
        }
    }

    public void deletePersons(NameAndSurnameID id) {
        personsJPARepository.deleteById(id);
    }

    List<Persons> getPersonAgeLessThan (int age) {
        List<NameAndSurnameID> list = nameAndSurnameJPARepository.findByAgeLessThan(age);
        List<Persons> persons = new ArrayList<>();
        List<Persons> listPersonsAll = getAllPersons();
        

    }




//    public void updatePersons() {
//        personsJPARepository.
//    }
}
