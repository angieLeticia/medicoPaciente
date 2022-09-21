
public class Patient {


    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private Double weigth;
    private Double heigth;
    private String blood;

    Patient(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void  setWeigth(double weigth){
        this.weigth = weigth;

    }
    public String getWeigth(){
        return this.weigth+ "kg.";
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
        this.phoneNumber = phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setWeigth(Double weigth) {
        this.weigth = weigth;
    }

    public Double getHeigth() {
        return heigth;
    }

    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
