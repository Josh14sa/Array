public class Pikachu extends Pokemon implements IELectrico{

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola Soy Pikachu acto Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola Soy Pikachu acto araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola Soy Pikachu acto mordisco");

    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Hola Soy pikachu este es mi ataque impac trueno");
    }

    @Override
    public void atacerPunoTrueno() {
        System.out.println("Hola Soy pikachu este es mi ataque puno trueno");
    }
}
