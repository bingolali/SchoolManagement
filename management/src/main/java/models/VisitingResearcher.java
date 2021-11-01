package models;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class VisitingResearcher extends Instructors{

    private double hourlySalary;

    public VisitingResearcher(int id, String name, String address, long phoneNumber, double hourlySalary) {
        super(id, name, address, phoneNumber);
        this.hourlySalary = hourlySalary;
    }

    public VisitingResearcher() {

    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VisitingResearcher that = (VisitingResearcher) o;
        return Double.compare(that.hourlySalary, hourlySalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hourlySalary);
    }

    @Override
    public String toString() {
        return "VisitingResearcher{" +
                "hourlySalary=" + hourlySalary +
                '}';
    }
}
