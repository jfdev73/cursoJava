public class HolaMundo {

    public static void main(String[] args) {
//        System.out.println("Juan Fernando");
//        int num = 0;
//        boolean b = false;
//        System.out.println("b = " + b);
//
//        System.out.println("num = " + num);
        String ejemplo = "hola, como estás, me llamo Juan Fernando";
        System.out.println("Resultado = " + capitalPalbra(ejemplo));

//        }


    }

    public static String  capitalPalbra(String p) {
        String palabra [];
        String res ="";

        palabra = p.split(" ");
        String palabra2 [] = new String[palabra.length];
        Character c;
        String firstC;
        for (int i =0;i<palabra.length;i++){
            c = palabra[i].charAt(0);
            firstC = c.toString();
            res +=palabra2[i] = palabra[i].replaceFirst(firstC,firstC.toUpperCase())+" ";

        }
        return res;
    }


}
