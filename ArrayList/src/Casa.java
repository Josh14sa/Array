public class Casa {
    private String color;
    private int area;
    private String modelo;

    public Casa() {
    }

    public Casa(String color, int area, String modelo) {
        this.color = color;
        this.area = area;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
