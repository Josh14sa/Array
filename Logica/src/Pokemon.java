public abstract  class Pokemon {

    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected int sexo;
    protected String temporada;

    public Pokemon() {
    }

    public Pokemon(int numPokedex, String nombre, double peso, int sexo, String temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
        this.temporada = temporada;
    }

    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
}
