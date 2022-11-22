package prohvataeva.sqlorm_hibernate_dao.controller;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.web.bind.annotation.*;
import prohvataeva.sqlorm_hibernate_dao.entity.NameAndSurnameID;
import prohvataeva.sqlorm_hibernate_dao.entity.Persons;
import prohvataeva.sqlorm_hibernate_dao.repository.SQLRepository;
import java.util.List;

@RestController
public class SQLController {
    final SQLRepository sqlRepository;

    public SQLController(SQLRepository sqlRepository) {
        this.sqlRepository = sqlRepository;
    }

    @GetMapping("/persons")
    public List<Persons> getAllPersons() {
        return sqlRepository.getAllPersons();
    }

//    Посмотреть пользователя по id
    @GetMapping("/persons/{id}")
    public List<Persons> getPersonsById(@PathVariable long id) {
        return sqlRepository.getPersonsById(id);
    }
//    Сохранить пользователя
    @PostMapping("/persons")
    public void saveOrUpdatePersons(@RequestBody Persons persons) {
        sqlRepository.saveOrUpdatePersons(persons);
    }
//    Изменить пользователя
//    Удалить пользователя
    @DeleteMapping("/persons")
    public void deletePersons(@RequestBody NameAndSurnameID id) {
        sqlRepository.deletePersons(id);
    }
//    создайте метод, который будет принимать возраст(age) и возвращать Entity из базы данных,
//    которые меньше переданного age и отсортированы по возрастанию.

//    создайте метод, который будет принимать имя и фамилию(name и surname) и возвращать Entity из базы данных,
//    которые соответствуют сочетанию name и surname и является Optional

    @GetMapping("/persons/by-city")
    public List<Persons> getPersonsByCity(@RequestParam(name = "city") String city) {
        return sqlRepository.getPersonsByCity(city);
    }








}
