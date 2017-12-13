package boletin14_ejer1;

public class Garaje {

    public static int plazas=5;
    private int nCoches;
    private String matricula;
    Coche coche1=new Coche("a", 0);
    Coche coche2=new Coche("a", 0);
    Coche coche3=new Coche("a", 0);
    Coche coche4=new Coche("a", 0);
    Coche coche5=new Coche("a", 0);
    Ticket tck=new Ticket();

    public Garaje() {

    }

    public Garaje(String matricula) {
        this.matricula=matricula;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula=matricula;
    }

    public void regisMat(String matri, long seg) {

        if (coche1.getMatricula()=="a") {
            coche1.setMatricula(matri);
            coche1.setEntradaSegundos(seg);

        } else if (coche2.getMatricula()=="a") {
            coche2.setMatricula(matri);
            coche2.setEntradaSegundos(seg);

        } else if (coche3.getMatricula()=="a") {
            coche3.setMatricula(matri);
            coche3.setEntradaSegundos(seg);

        } else if (coche4.getMatricula()=="a") {
            coche4.setMatricula(matri);
            coche4.setEntradaSegundos(seg);

        } else {
            coche5.setMatricula(matri);
            coche5.setEntradaSegundos(seg);

        }

    }

    public void vaciarMat(String matri) {
        if (coche1.getMatricula().equals(matri)) {
            tck.mostrarTicket(coche1.getMatricula(), coche1.getEntradaSegundos());
            coche1.setMatricula("a");

        } else if (coche2.getMatricula().equals(matri)) {
            tck.mostrarTicket(coche1.getMatricula(), coche1.getEntradaSegundos());
            coche2.setMatricula("a");

        } else if (coche3.getMatricula().equals(matri)) {
            tck.mostrarTicket(coche1.getMatricula(), coche1.getEntradaSegundos());
            coche3.setMatricula("a");

        } else if (coche4.getMatricula().equals(matri)) {
            tck.mostrarTicket(coche1.getMatricula(), coche1.getEntradaSegundos());
            coche4.setMatricula("a");

        } else {
            tck.mostrarTicket(coche1.getMatricula(), coche1.getEntradaSegundos());
            coche5.setMatricula("a");

        }

    }

    public void metEntra() {

        if (plazas==0) {
            System.out.println("Completo");
        } else {
            plazas-=1;
            System.out.println("Quedan "+plazas+" libres");
        }
    }

    public void metSale() {
        plazas+=1;
        System.out.println("Quedan "+plazas+" libres");
    }

}
