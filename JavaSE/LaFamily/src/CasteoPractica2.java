import java.util.Scanner;

public class CasteoPractica2 {
    public static void main(String[] args) {
        /**
        char c = 'z';
        int intC = (int) c;
        int i = 250;
        long longI = i;
        short shortLongI = (short) longI;
        double d = 301.067;
        long longD = (long) d;
        int i2 = 100;
        float floatSumaI2 = (float)i2 + (float) 5000.66;
        int i3 = 737;
        i3*=100;
        byte byteInt3 = (byte) i3;
        double di = 298.638;
        di = di/25;
        long longDi = (long) d;
        byte ig = 1; byte j = 1; byte k = ig+j;
*/

        boolean lampara = false;
        encenderLampara(lampara);
        emitirMensaje(lampara);

    }


    public static boolean encenderLampara(Boolean lampara){
        if (lampara == false) {
            lampara = true;
            return true;
        }else {
            return true;
        }
    }

    public static boolean apagarLampara(Boolean lampara){
        if (lampara == true) {
            return false;
        }else{
            return false;
        }
    }

    public static void emitirMensaje(boolean lampara){
        if (lampara == true){
            for (int i=0; i<10;i++){
                imprimirSOS();
            }
            return;
        }else {
            System.out.println("No esta encendida\n");
            System.out.println("Desea encendarla? ");
            Scanner leer = new Scanner(System.in);
            String decicion = leer.nextLine();
            if (decicion != "SI") {
                encenderLampara(lampara);
                imprimirSOS();
            }else {
                System.out.println("No se enviara el mensaje");
                return;
            }
        }
    }


    public static void imprimirSOS(){
        System.out.println(". . . -- -- -- . . .");
    }


}