package services;

import entities.Customer;

import java.time.LocalDateTime;

public interface CustomerService {

    public Long addCustomer(Customer newCustomer);  //olusturdugumuzzun id sini geri dönecegimiz icin return type long koyduk

    public void updateResevation(Customer customer);

    public double calculatePayment();

    public void checkIn(Customer customer, LocalDateTime dateCheckIn) ;

    public void checkOut(Customer customer,  LocalDateTime dateChechOut );

    public Long deleteCustomer(Customer customer); // burdada sildigimiz müsterinin id si geri gelecek o yuzden return type Long oldu

}
