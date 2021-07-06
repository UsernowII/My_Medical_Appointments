package ui;

import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS ={"January", "February", "March", "April", "May", "Jun", "July", "August", "September", "November", "December"};

    public static void showMenu(){
        System.out.println("Welcome to my Appointments");
        System.out.println("Select the desired option");

        int response =0;
        do{
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for your visit");
                    break;
                default:
                    System.out.println("Please select a correct option");
            }
        }while (response!= 0);

    }

    public static void showPatientMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1.Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book and appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + "." + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My Appointments");
                    break;
                case 0:
                    showMenu();
                    break;
                default:
                    System.out.println("Please select a correct option");
            }
        }while(response !=0);
    }

}