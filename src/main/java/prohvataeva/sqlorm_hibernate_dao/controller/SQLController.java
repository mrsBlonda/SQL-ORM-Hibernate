package prohvataeva.sqlorm_hibernate_dao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import prohvataeva.sqlorm_hibernate_dao.repository.SQLRepository;

import java.util.List;

@RestController
public class SQLController {
    final SQLRepository sqlRepository;

    public SQLController(SQLRepository sqlRepository) {
        this.sqlRepository = sqlRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductByName(@RequestParam(name = "name") String name) {
        return sqlRepository.getProductByName(name);
    }


}
