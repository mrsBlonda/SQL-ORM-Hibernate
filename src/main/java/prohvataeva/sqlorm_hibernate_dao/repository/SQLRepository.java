package prohvataeva.sqlorm_hibernate_dao.repository;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;
import prohvataeva.sqlorm_hibernate_dao.entity.Orders;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class SQLRepository {
    @PersistenceContext
    EntityManager entityManager;


    public List<String> getProductByName(String name) {


        var query = entityManager.createQuery(read("SelectProductOfName.sql"));
        query.setParameter("name", name);
        List<Orders> ordersList = query.getResultList();
        List<String> listOfProduct = new ArrayList<>();
        for (Orders order : ordersList) {
            listOfProduct.add(order.getProductName());
        }
        return listOfProduct;
//        String p = query.getProductName();
//        return p;
    }



    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
