import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

       Doctor myDoctor = new Doctor("Piero","Cardiologia",1,true,1);
       myDoctor.showDoctor();
       Doctor myDoctor2 = new Doctor();
       System.out.println("\n");
       myDoctor2.showDoctor();
       showMenu();
    }

}
