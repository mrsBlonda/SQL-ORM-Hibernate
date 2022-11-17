package prohvataeva.sqlorm_hibernate_dao.repository;

import org.springframework.stereotype.Repository;
import prohvataeva.sqlorm_hibernate_dao.entity.Persons;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SQLRepository {
    @PersistenceContext
    EntityManager entityManager;


    public List<Persons> getPersonsByCity(String city) {

        var query = entityManager.createQuery("select p from Persons p where p.cityOfLiving = :city ");
        query.setParameter("city", city);
        List<Persons> personsList = query.getResultList();
        return personsList;
    }


}
