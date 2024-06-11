package calendario;
import java.util.*;
import javax.swing.JOptionPane;
public class Calendario {
    public static void main(String[] args) {
        int n;
        String k;
        Scanner l = new Scanner(System.in);
        k=JOptionPane.showInputDialog(null,"Ingresa un numero entre 1 y 12: ");
        n = Integer.parseInt(k);
        switch(n)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "Escogiste Enero tiene 31 dias");
             break;
             case 2:
                JOptionPane.showMessageDialog(null, "Escogiste Febrero tiene 28 dias en año normal y 29 dias en año bisiesto");
             break;
             case 3:
                JOptionPane.showMessageDialog(null, "Escogiste Marzo tiene 31 dias");
             break;
             case 4:
                JOptionPane.showMessageDialog(null, "Escogiste Abril tiene 30 dias");
             break;
             case 5:
                JOptionPane.showMessageDialog(null, "Escogiste Mayo tiene 31 dias");
             break;
             case 6:
                JOptionPane.showMessageDialog(null, "Escogiste Junio tiene 30 dias");
             break;
             case 7:
                JOptionPane.showMessageDialog(null, "Escogiste Julio tiene 31 dias");
             break;
             case 8:
                JOptionPane.showMessageDialog(null, "Escogiste Agosto tiene 31 dias");
             break;
             case 9:
                JOptionPane.showMessageDialog(null, "Escogiste Septiembre tiene 30 dias");
             break;
             case 10:
                JOptionPane.showMessageDialog(null, "Escogiste Octubre tiene 31 dias");
             break;
             case 11:
                JOptionPane.showMessageDialog(null, "Escogiste Noviembre tiene 30 dias");
             break;
             case 12:
                JOptionPane.showMessageDialog(null, "Escogiste Diciembre tiene 31 dias");
             break;
             default:
                 JOptionPane.showMessageDialog(null,"Escogiste un mes incorrecto","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    } 
}
