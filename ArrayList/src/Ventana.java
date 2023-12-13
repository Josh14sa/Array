public class Ventana {
    private int largo;
    private String color;
    private double perimetro;

    public Ventana() {
    }

    public Ventana(int largo, String color, double perimetro) {
        this.largo = largo;
        this.color = color;
        this.perimetro = perimetro;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
