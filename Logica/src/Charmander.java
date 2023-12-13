public class Charmander extends Pokemon implements IFuego{


    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola Soy Charmander acto Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola Soy Charmander acto araniazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola Soy Charmander acto mordisco");

    }

    @Override
    public void atacarPunoFuego() {
        System.out.println("Hola Soy Charmander este es mi ataque puno fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Hola Soy Charmander este es mi ataque lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola Soy Charmander este es mi ataqque ascuas");
    }
}
