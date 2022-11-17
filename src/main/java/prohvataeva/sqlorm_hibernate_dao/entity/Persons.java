package prohvataeva.sqlorm_hibernate_dao.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Persons {
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @EmbeddedId
    NameAndSurnameID nameAndSurnameID;
    @Column
    private String phoneNumber;
    @Column
    private String cityOfLiving;



}
