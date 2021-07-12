package Model;

public class Nurse extends User {
    private String speciality;

    public Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado Hospital: Cruz Verde");
        System.out.println("Departamento: Nutriologia, Pediatria");
    }

    public String getSpeciality(){
        return speciality;
    }

    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }
}
