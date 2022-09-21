import java.util.Date;

import  static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

       // showMenu();//

        Doctor myDoctor = new Doctor("Ahahi Salgado","Pediatria");
        myDoctor.addAvaibleAppointment(new Date(),"4pm");
        myDoctor.addAvaibleAppointment(new Date(),"5pm");
        myDoctor.addAvaibleAppointment(new Date(),"1pm");
        System.out.println(myDoctor.getAvailableAppointments());

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate()+""+aA.getDate());
        }
/*
       String name = "Ann";

       Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
       Patient patient1 = new Patient("Anai", "anaisal@gmail.com");
        System.out.println(patient.getName());
        System.out.println(patient1.getName());
       patient1 = patient;
        System.out.println(patient.getName());
        System.out.println(patient1.getName());*/
    }
}
