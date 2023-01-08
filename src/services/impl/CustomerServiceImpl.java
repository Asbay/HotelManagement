package services.impl;

import entities.Customer;
import services.CustomerService;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {



    public Map<Long, Customer> customers = new HashMap<>();

    public CustomerServiceImpl(){
        Customer customer1 = new Customer(1L, "Emre", "kaya", "3123124545");
        Customer customer2 = new Customer(2L, "Hasan", "Mezarci", "3123124545");
        Customer customer3 = new Customer(3L, "Neval", "Yurt", "3157485647");
        Customer customer4 = new Customer(4L, "Ayse", "Yilmaz", "2342345665");

        customers.put(customer1.getId(),customer1);
        customers.put(customer2.getId(),customer2);
        customers.put(customer3.getId(),customer3);
        customers.put(customer4.getId(),customer4);



    }





    @Override
    public Long addCustomer(Customer newCustomer) {
      customers.put(newCustomer.getId(), newCustomer);
      return newCustomer.getId();

    }

    @Override
    public void updateResevation(Customer customer ) {


    }

    @Override
    public double calculatePayment() {
        return 0;
    }

    @Override
    public void checkIn(Customer customer, LocalDateTime dateCheckIn) {
        customer.setCheckIn(dateCheckIn);

    }

    @Override
    public void checkOut(Customer customer,  LocalDateTime dateChechOut ) {
        customer.setCheckeOut(dateChechOut);
       // LocalDateTime dateChechOut = LocalDateTime.of(2023, Month.MARCH,19,13,00);

    }

    @Override
    public Long deleteCustomer(Customer deletedcustomer) {
        customers.remove(deletedcustomer.getId());
        return deletedcustomer.getId();
    }
}
