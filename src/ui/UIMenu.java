package ui;

import Model.Doctor;
import Model.Patient;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS ={"January", "February", "March", "April", "May", "Jun", "July", "August", "September", "November", "December"};

    public static Doctor doctorLogged;
    public static Patient patientLogged;

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
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
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

    private static void authUser(int userType){
        //userType = 1 Doctor
        //userType = 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        doctors.add(new Doctor("Alejandro Martinez", "alej@gmail.com"));
        doctors.add(new Doctor("Karen Sosa", "karito@gmail.com"));
        doctors.add(new Doctor("Rocio Gomez", "rocio@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Anahit Salgado", "anahi@gmail.com"));
        patients.add(new Patient("Roberto Rodriguez", "robert@gmail.com"));
        patients.add(new Patient("Carlos Sanchez", "carlos@gmail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [@gmail.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType ==1){
                for(Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener datos del usuario logeado
                        doctorLogged = d;
                        UiDoctorMenu.showDoctorMenu();
                    }
                }
            }
            if (userType ==2){
                for(Patient p: patients){
                    if ( p.getEmail().equals(email)){
                        emailCorrect = true;
                        patientLogged = p;
                        UiPatientMenu.showPatientMenu();
                    }
                }
            }
        }while(!emailCorrect);
    }

    public static void showPatientMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Model.Patient");
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
