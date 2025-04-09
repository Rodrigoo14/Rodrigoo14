public class Paquete<T> {
    private T objeto;
    private double peso;
    private double largo;
    private double ancho;
    private double alto;
    private int prioridad;

    public Paquete(T objeto, double peso, double largo, double ancho, double alto, int prioridad) {
        this.objeto = objeto;
        this.peso = peso;
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.prioridad = prioridad;
    }

    public T getObjeto() {
        return this.objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }
    
    public double getLargo() {
        return this.largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto () {
        return this.alto = alto;
    }

    public void setAlto (double alto) {
        this.alto = alto;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public void setPrioridad() {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "PAQUETE\nContenido: " + this.objeto + "\nDimensiones (Largo x Ancho x Alto): " + this.largo + " x " + this.ancho +
        " x " + this.alto + "\nPrioridad: " + this.prioridad + "\n";
    }
}