public class Squartool extends Pokemon implements IAgua{

    public Squartool() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola Soy Squartool acto Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola Soy Squartool acto araniazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola Soy Squartool acto mordisco");

    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola Soy Squartool este es mi ataque hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola Soy Squartool este es mi ataque burbuja");

    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola Soy Squartool este es mi ataque pitola de aagua");
    }
}
