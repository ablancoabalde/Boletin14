package boletin14_ejer1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Ticket extends Coche {

    private long segundos;
    private String factura;
    private float precio;
    private float cRecibidos;
    private float cDevueltos;
    Calendar calendario=new GregorianCalendar();

    public Ticket() {
    }

    public Ticket(int minutos, String factura, float precio, float cRecibidos, float cDevueltos, String matricula, long eSeg) {
        super(matricula, eSeg);
        this.factura=factura;
        this.precio=precio;
        this.cRecibidos=cRecibidos;
        this.cDevueltos=cDevueltos;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura=factura;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio=precio;
    }

    public float getcRecibidos() {
        return cRecibidos;
    }

    public void setcRecibidos(float cRecibidos) {
        this.cRecibidos=cRecibidos;
    }

    public float getcDevueltos() {
        return cDevueltos;
    }

    public void setcDevueltos(float cDevueltos) {
        this.cDevueltos=cDevueltos;
    }

    public void mostrarTicket(String matr, long eSeg) {

        segundos=System.currentTimeMillis();
        long tiempoestado=segundos-eSeg;
        if (tiempoestado<=3000) {
            precio=1.5f;

        } else {
            long calcMiSeg=tiempoestado-3000;
            precio=1.5f+(float) (calcMiSeg*0.0000002);
        }
        JOptionPane.showMessageDialog(null,precio);
        int dinerIntr=Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de dinero introducida"));
        
        System.out.println("FACTURA\n"+"Matrícula coche: "+matr+"\n Tiempo: "+tiempoestado+"\n Precio: "+precio
        + "\nDinero introducido: " + dinerIntr + "\nDinero Devolver: "+(dinerIntr-precio));
    }

}
