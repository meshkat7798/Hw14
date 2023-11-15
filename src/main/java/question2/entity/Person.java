package question2.entity;

import lombok.*;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {
    public final static String TABLE_NAME = "Person";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotBlank(message = "first name not empty")
    private String firstName;
    @NotBlank(message = "last name not empty")
    private String lastName;

    private Date birthDay;
}


