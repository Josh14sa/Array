public class Fierro {
    private String modelo;
    private  String marca;
    private double tamano;

    public Fierro() {
    }

    public Fierro(String modelo, String marca, double tamano) {
        this.modelo = modelo;
        this.marca = marca;
        this.tamano = tamano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
}
