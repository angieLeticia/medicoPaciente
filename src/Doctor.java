import java.util.ArrayList;
import java.util.Date;

public class Doctor {
   static int id  = 0;
    private  String name;
    private  String email;
    private String speciality;


    Doctor(){
        System.out.println("Comtruyendo el objeto Doctor");

    }

    Doctor(String name, String speciality){
        id++;
        System.out.println("El nombre es"+name);
        this.name = name;
        this.speciality = speciality;
    }

    public void showName(){
        System.out.println(name);
    }

    public void showId() {
        System.out.println("Id doctor: "+id);
    }
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvaibleAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date,time));
    }
     public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
     }

    public class AvailableAppointment{

        private int id;
        private Date date;
        private String time;
        public AvailableAppointment (Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
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
    }


}
