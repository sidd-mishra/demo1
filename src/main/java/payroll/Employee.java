package payroll;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
class Employee {
    private @Id
    @GeneratedValue Long id;
    private String name;
    private String role;
    private int age;
    private int salary;

    Employee() {}

    Employee(String name, String role, int age, int salary) {

        this.name = name;
        this.role = role;
        this.age = age;
        this.salary = salary;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

    public int getAge() {
        return this.age;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name)
                && Objects.equals(this.role, employee.role) && Objects.equals(this.age, employee.age) && Objects.equals(this.salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role, this.age, this.salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", role='" + this.role + '\'' +
                ", age=" + this.age +
                ", salary=" + this.salary +
                '}';
    }
}