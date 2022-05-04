import java.util.Scanner;

public class TanqueGasolina {
    public static void main(String[] args) {
        int  medidaActual;


        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa la cantidad acual del tanque: ");
        medidaActual = scan.nextInt();
        if (medidaActual ==70){
            System.out.println("Tanque lleno");
        }else if(medidaActual>=60 && medidaActual<70){
            System.out.println("Tanque casi lleno");
        }else if(medidaActual>=40 && medidaActual<60){
            System.out.println("Tanque a 3/4");
        }else if(medidaActual>=35 && medidaActual<40){
            System.out.println("Medio tanque");
        }else if(medidaActual>=20 && medidaActual<35){
            System.out.println("Suficiiente");
        }else if(medidaActual>=1 && medidaActual<20){
            System.out.println("Insuficiiente");
        }



    }
}
