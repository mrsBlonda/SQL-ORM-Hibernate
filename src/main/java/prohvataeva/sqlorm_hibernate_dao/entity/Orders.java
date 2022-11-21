package prohvataeva.sqlorm_hibernate_dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table()
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String date;
    @Column
    private String productName;
    @Column
    private int amount;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customers customersId;

    public Orders(String date, String productName, int amount, Customers customersId) {
        this.date = date;
        this.productName = productName;
        this.amount = amount;
        this.customersId = customersId;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "date='" + date + '\'' +
                ", productName='" + productName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
