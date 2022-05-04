import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String name, name2, name3;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa el primer nombre: ");
        name = scan.nextLine();
        System.out.println("Ingresa el segundo nombre: ");
        name2 = scan.nextLine();
        System.out.println("Ingresa el tercer nombre: ");
        name3 = scan.nextLine();
        String cad,cad2,cad3;
        cad = name.substring(name.length()-2);
        cad2 = name2.substring(name2.length()-2);
        cad3 = name3.substring(name3.length()-2);
        System.out.println("cadena = " + cad);

        String hashCadena;
//
        hashCadena = name.substring(1,2).toUpperCase()+"."+cad+"_"+name2.substring(1,2).toUpperCase()+".";
        hashCadena += cad2+"_"+name3.substring(1,2).toUpperCase()+"."+cad3;
        System.out.println("hashCadena = " + hashCadena);
    }
}
