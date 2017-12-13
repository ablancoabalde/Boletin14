
package boletin14_ejer1;



public class Coche {
    private String matricula;
    private long entradaSegundos;
    public Coche() {
    }
    public Coche(String matricula, long eSeg) {
        this.matricula=matricula;
        this.entradaSegundos=eSeg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula=matricula;
    }

    public long getEntradaSegundos() {
        return entradaSegundos;
    }

    public void setEntradaSegundos(long eSeg) {
        this.entradaSegundos=eSeg;
    }
    

    
}

