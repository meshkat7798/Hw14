package question2.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Teacher extends Person{
    public static final String TABLE_NAME = "Teacher";
    private Integer teacherNumber;

    private String degreeOfEducation;

    private Long salary;

    private TeacherDegree degree;
}

