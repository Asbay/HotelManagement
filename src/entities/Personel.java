package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Personel extends AbstractEntitiy{

    private Long id;

    private Profession profession;

    private double salary;

    private LocalDate startDateOfWork;



    // private LocalDateTime createdDate;
    //private LocalDateTime editedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getStartDateOfWork() {
        return startDateOfWork;
    }

    public void setStartDateOfWork(LocalDate startDateOfWork) {
        this.startDateOfWork = startDateOfWork;
    }
}
