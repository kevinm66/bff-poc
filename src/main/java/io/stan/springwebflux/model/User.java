package io.stan.springwebflux.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@EqualsAndHashCode(of = {"id","name","department"})
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(value = "users")
public class User {

    @Id
    private String id;
    private String name;
    private int age;
    private double salary;
    private String department;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
