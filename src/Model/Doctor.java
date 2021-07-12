package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    // Estado Attributes
    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    //Metodo constructor

    public Doctor(String name, String email){
        super(name, email);
    }
    //Getters and Setters
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Comportamiento
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("Id Model.Doctor: "+ id);
    }


    public void addAvailableAppointment(String date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    @Override
    public String toString() {
        return super.toString() +
                "speciality='" + speciality + '\'' +
                ",\nAvailable Appointments=" + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerologia");
    }

    //metodo clase Anidada
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }
    //clase Anidada
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate() {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointments \nDate: "+ date + "\nTime: " + time;
        }
    }

}
