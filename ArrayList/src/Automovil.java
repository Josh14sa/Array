public class Automovil {

    private double recorrido;
    private String modelo;
    private int llantas;

    public Automovil() {
    }

    public Automovil(double recorrido, String modelo, int llantas) {
        this.recorrido = recorrido;
        this.modelo = modelo;
        this.llantas = llantas;
    }

    public double getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(double recorrido) {
        this.recorrido = recorrido;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }
}
