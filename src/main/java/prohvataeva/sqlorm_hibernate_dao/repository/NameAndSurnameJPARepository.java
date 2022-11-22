package prohvataeva.sqlorm_hibernate_dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prohvataeva.sqlorm_hibernate_dao.entity.NameAndSurnameID;


import java.util.List;

public interface NameAndSurnameJPARepository extends JpaRepository<NameAndSurnameID, NameAndSurnameID> {

//    создайте метод, который будет принимать возраст(age) и возвращать Entity из базы данных,
//    которые меньше переданного age и отсортированы по возрастанию.

    List<NameAndSurnameID> findByAgeLessThan (int age);


}
