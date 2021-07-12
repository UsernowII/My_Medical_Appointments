package Model;

public abstract class User {
    static int id;
    static String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() <7){
            System.out.println("The number must be 7 digits");
        }else if(phoneNumber.length() == 7){
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString() {
        return  "Model.User= " + name +
                "\nemail='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'';
    }

    public abstract  void showDataUser();
}


