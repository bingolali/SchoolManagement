package models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private LocalDate birthDay;
    private String adress;
    private StudentGender gender;

    @ManyToMany
    private List<Course> courses = new ArrayList<>();


    public Student(int id, String name, LocalDate birthDay, String adress, StudentGender gender) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.adress = adress;
        this.gender = gender;
    }



    public Student() {
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public StudentGender getGender() {
        return gender;
    }

    public void setGender(StudentGender gender) {
        this.gender = gender;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && name.equals(student.name) && birthDay.equals(student.birthDay) && adress.equals(student.adress) && gender == student.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthDay, adress, gender);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", adress='" + adress + '\'' +
                ", gender=" + gender +
                '}';
    }
}
