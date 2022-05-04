import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        String[] nombresCompletos = new String[3];

        nombresCompletos[0] = JOptionPane.showInputDialog("Ingresa el primer nombre");
        nombresCompletos[1] = JOptionPane.showInputDialog("Ingresa el segundo nombre");
        nombresCompletos[2] = JOptionPane.showInputDialog("Ingresa el tercer nombre");

        String nombres[] = new String[3];


        nombres[0] = nombresCompletos[0].split(" ")[0];
        nombres[1] = nombresCompletos[1].split(" ")[0];
        nombres[2] = nombresCompletos[2].split(" ")[0];


        if(nombres[0].length() > nombres[1].length() && nombres[0].length() > nombres[2].length()){
            JOptionPane.showMessageDialog(null, nombresCompletos[0]+" tiene el nombre más largo.");

        }else if(nombres[1].length() >nombres[2].length()){
            JOptionPane.showMessageDialog(null, nombresCompletos[1]+" tiene el nombre más largo.");
        }else{
            JOptionPane.showMessageDialog(null, nombresCompletos[2]+" tiene el nombre más largo.");
        }
    }

}
