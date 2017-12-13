package boletin14_ejer1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Boletin14_ejer1 {

    public static void main(String[] args) {
        Calendar calendario=new GregorianCalendar();
        long entradasegundos;
        Garaje ob=new Garaje();

        int contador=5;

        System.out.println("Hay "+Garaje.plazas+" plazas");
        int resp=JOptionPane.showConfirmDialog(null, "Ejecutarse");
        while (resp==0) {

            int respuesta=Integer.parseInt(JOptionPane.showInputDialog(null, "Opcion 1 introduce coche, Opcion 2 vacia coche"));
            System.out.println(respuesta);
            switch (respuesta) {
                case 1:
                    ob.metEntra();
                    ob.regisMat(JOptionPane.showInputDialog(null, "Introducir matricula"), (entradasegundos= System.currentTimeMillis()));

                    break;
                case 2:
                    System.out.println("Coche sale");
                    ob.metSale();

                    ob.vaciarMat(JOptionPane.showInputDialog(null, "Introducir matricula"));
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }
            
            resp=JOptionPane.showConfirmDialog(null, "Ejecutarse");

        }

    }

}
