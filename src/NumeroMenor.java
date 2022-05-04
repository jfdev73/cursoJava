import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cantidad = 0, numero, numeroMenor = Integer.MAX_VALUE;

        while (cantidad<10){
            System.out.println("Cuantos numeros desea ingresar");
            cantidad = scan.nextInt();
        }

        for (int i = 0; i < cantidad; i++) {
            int j = i;
            System.out.println("ingresa el "+(++j) +" numero");
            numero = scan.nextInt();

            if(numeroMenor < numero){
                continue;
            }
            numeroMenor = numero;
        }

        System.out.println("numeroMenor = " + numeroMenor);

        System.out.println((numeroMenor>=10)?"El número es mayor o igual a 10":"El número es menor a 10");
        
        
    }
}
