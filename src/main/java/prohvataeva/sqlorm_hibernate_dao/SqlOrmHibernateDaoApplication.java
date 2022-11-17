package prohvataeva.sqlorm_hibernate_dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import prohvataeva.sqlorm_hibernate_dao.repository.SQLRepository;

@SpringBootApplication
public class SqlOrmHibernateDaoApplication {
    
    

    public static void main(String[] args) {
        SpringApplication.run(SqlOrmHibernateDaoApplication.class, args);

    }

}
