public class Volvasour extends Pokemon implements IPlanta{


    public Volvasour() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola Soy Buolvasor ataco Placaje");

    }

    @Override
    protected void atacarAraniazo() {
         System.out.println("Hola Soy Buolvasor ataco Araniazo");


    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola Soy Buolvasor ataco mordisco");

    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola Soy Buolvasor este es mi ataque drenaje");

    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola Soy Buolvasor este es mi ataque paralizar");
    }
}
