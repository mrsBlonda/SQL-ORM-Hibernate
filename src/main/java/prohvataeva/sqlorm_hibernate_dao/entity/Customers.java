package prohvataeva.sqlorm_hibernate_dao.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.agent.builder.AgentBuilder;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CUSTOMERS")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private int age;
    @Column
    private String phoneNumber;
    @OneToMany(mappedBy = "customersId", cascade = CascadeType.ALL)
    private List<Orders> ordersList;

}
