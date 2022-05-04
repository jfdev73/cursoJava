public class SentenciasBucles {
    public static void main(String[] args) {
        String frase = "tres trigo tristes tigres tragaron trigo en un trigal";
        String palabra = "trigo";
        int cantidad = 0;
        int maxFrase = frase.length();
        int maxPalabra = palabra.length();

        buscar:
        for (int i = 0; i < maxFrase;) {
            int k = i;

            for (int j = 0; j < maxPalabra; j++) {

                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            i = i+maxPalabra;
            cantidad++;
        }
        System.out.println(cantidad + " veces encontrado la palabra " + palabra + " en la frase");
    }
}