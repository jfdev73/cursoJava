public class prueba {
    public static void main(String[] args) {
        String frase = "tres trigo tristes tigres tragaron trigo en un trigal";
        String palabra = "trigo";
        int cantidad = 0;
        int maxFrase = frase.length();
        int maxPalabra = palabra.length();
//
//        String subCadena = frase.substring((frase.indexOf("trigo")+palabra.length()), frase.length());
//        System.out.println("frase = " + frase.indexOf("trigo"));
//        System.out.println("subCadena = " + subCadena);
        int contador = 0;
        while (frase.indexOf(palabra) > -1) {
            frase = frase.substring(frase.indexOf(palabra)+palabra.length(),frase.length());
            contador++;
        }
        System.out.println("contador = " + contador);

        for (int i = 0; i < 3; i++) {
            System.out.println("");

            for (int j = 0; j <8 ; j++) {
                System.out.print("*");
            }

        }
    }
}
