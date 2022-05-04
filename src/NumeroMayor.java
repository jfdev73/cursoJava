import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
//        int num, num2, numMayor;
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Ingresa el primer número: ");
//        num = scan.nextInt();
//        System.out.println("Ingresa el segundo número: ");
//        num2 = scan.nextInt();
//
//        numMayor = num > num2 ? num : num2;
//
//        System.out.println("El número mayor es: "+numMayor);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el numero 2: ");
        int num2 = scanner.nextInt();

        String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println("El orden es: " + resultado);

    }
}
