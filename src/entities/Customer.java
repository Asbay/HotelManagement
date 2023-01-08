package entities;

import java.time.LocalDateTime;

public class Customer extends  AbstractEntitiy{

    private Long id;
    private LocalDateTime checkIn;
    private LocalDateTime checkeOut;

    public Customer(){

    }

    public Customer(Long id, String firstName, String lastName, String mobilePhone ){
        this.id= id;
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setMobilePhone(mobilePhone);


    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName=" + getFirstName() +
                ", lastName=" + getLastName() +
                ", mobilePhone=" + getMobilePhone() +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckeOut() {
        return checkeOut;
    }

    public void setCheckeOut(LocalDateTime checkeOut) {
        this.checkeOut = checkeOut;
    }
}
