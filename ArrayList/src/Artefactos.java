public class Artefactos {
    private String modelo;
    private int tamano;
    private String color;

    public Artefactos() {
    }

    public Artefactos(String modelo, int tamano, String color) {
        this.modelo = modelo;
        this.tamano = tamano;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
