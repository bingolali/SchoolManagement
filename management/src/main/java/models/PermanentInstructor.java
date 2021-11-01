package models;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class PermanentInstructor extends Instructors {

    private double fixedSalary;

    public PermanentInstructor(int id, String name, String address, long phoneNumber, double fixedSalary) {
        super(id, name, address, phoneNumber);
        this.fixedSalary = fixedSalary;
    }

    public PermanentInstructor() {

    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PermanentInstructor that = (PermanentInstructor) o;
        return Double.compare(that.fixedSalary, fixedSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fixedSalary);
    }

    @Override
    public String toString() {
        return "PermanentInstructor{" +
                "fixedSalary=" + fixedSalary +
                '}';
    }
}
