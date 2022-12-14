package zinkatech.com.gestionemploidepartment.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeePhone;
    @ManyToOne
    Department department;
}
