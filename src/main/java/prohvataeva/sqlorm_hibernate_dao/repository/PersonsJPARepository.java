package prohvataeva.sqlorm_hibernate_dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prohvataeva.sqlorm_hibernate_dao.entity.NameAndSurnameID;
import prohvataeva.sqlorm_hibernate_dao.entity.Persons;

import java.util.List;

public interface PersonsJPARepository extends JpaRepository<Persons, NameAndSurnameID> {



    List<Persons> findByCityOfLiving (String cityName);

//    создайте метод, который будет принимать возраст(age) и возвращать Entity из базы данных,
//    которые меньше переданного age и отсортированы по возрастанию.




}
