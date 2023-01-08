package entities;

import services.impl.CustomerServiceImpl;

import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        CustomerServiceImpl customerService = new CustomerServiceImpl();
       // Customer customer5 =new Customer(5L, "Halil", "Ibrahim","3124364");
        //customerService.addCustomer(customer5);
        //customerService.customers.entrySet().stream().forEach(System.out :: println);

        System.out.println("--------Hosgeldiniz----------");
        System.out.println("Lütfen bir islem seciniz");
        System.out.println("1- Müsteri islemler");
        System.out.println("2-Personel islemleri");
        System.out.println("3- Oda bilgileri");
        System.out.println("$- Cikis");


        Scanner scan = new Scanner(System.in);
        int islemNo= scan.nextInt();

        switch (islemNo){

            case 1:
                System.out.println("Müsteri ismini giriniz");
                String firstName = scan.nextLine();
                System.out.println("müsteri soy ismini giriniz");
                String lastName= scan.next();



        }
    }
}
