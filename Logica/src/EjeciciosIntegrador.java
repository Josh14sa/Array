public class EjeciciosIntegrador {
    public static void main(String[] args) {

        Squartool squartool = new Squartool();
        Charmander charmander = new Charmander();
        Volvasour volvasour = new Volvasour();
        Pikachu pikachu = new Pikachu();

        squartool.atacarAraniazo();
        squartool.atacarHidrobomba();

        charmander.atacarAraniazo();
        charmander.atacarLanzaLlamas();

        volvasour.atacarAraniazo();
        volvasour.atacarDrenaje();

        pikachu.atacarAraniazo();
        pikachu.atacarImpacTrueno();

    }
}
