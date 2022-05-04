import java.util.Scanner;

public class Tarea2 {
    /*La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura,
    se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la
    siguiente manera:

Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre
de la factura con espacios.

Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).

Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%

Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto),
el impuesto y el monto total neto incluyendo impuesto.

Por ejemplo, el resultado podría ser algo así:

La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y
el monto después de impuesto es de 160.3882

IMPORTANTE: Como nota aparte todas las tareas publicadas en el curso son opcionales,
no afecta en nada en el avance del curso ni en el temario, tampoco afecta en la entrega
final del diploma o reconocimiento por haber finalizado el curso, son 100% opcionales y
todas traen incluidas el código de solución.
Así es como funciona el sistema de tareas de udemy, las tareas no quedan marcadas con
checked (como realizadas), esta funcionalidad no tiene nada que ver con nuestro curso
ni el instructor, así es como funciona la plataforma de Udemy.*/
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        double precio, precio2, total, iva,totalConImpuesto;
//        System.out.println("Ingrese el nombre de la facutra");
//        String nombreFactura = scan.nextLine();
//        System.out.println("Ingrese el precio del primer producto");
//        precio = scan.nextDouble();
//        System.out.println("Ingrese el precio del segundo producto");
//        precio2 = scan.nextDouble();
//        total = precio+precio2;
//        iva = total*0.19;
//        totalConImpuesto = total+iva;
//        String mensaje;
//        mensaje = "La factura: "+nombreFactura+" tiene un total bruto de: "+total+" , con un impuesto de ";
//        mensaje += iva+" y el monto despues de impuesto de: "+totalConImpuesto;
//        System.out.println(mensaje);
            
        String msj = "";
        msj = "Juan Fernando Miranda";
        System.out.println("msj.indexOf(\"Fernando\") = " + msj.indexOf("Mir"));
        
        boolean isBlank = msj.isBlank();
        System.out.println("isBlank = " + isBlank);



    }
}
