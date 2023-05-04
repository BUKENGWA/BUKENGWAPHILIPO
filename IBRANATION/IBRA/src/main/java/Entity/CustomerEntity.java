package Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "CustomerTable")
public class CustomerEntity {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "CustomerId")
    int CustomerID;
    @Column(name = "firtName")
    String firstName;
    @Column(name = "middleName")
    String middleName;
    @Column(name = "location")
    String location;
}
