import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayLista {
    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona(1,"Jose",29));
        lista.add(new Persona(2,"Xavi",37));
        lista.add(new Persona(3,"Juan",73));
        lista.add(new Persona(4,"Sara",26));

        System.out.println("--------------For Clasico--------------");
        //Recorrido por indice
        for (int i = 0 ; i<lista.size();i++){
            System.out.println("prueba : " + lista.get(i).getNombre());
        }
        System.out.println("---------For each----------");
        //Recorrido foreach
        for (Persona persona : lista){
            System.out.println("prueba : " + persona.getNombre());
        }

        List<Automovil> listados = new ArrayList<Automovil>();

        listados.add(new Automovil(400,"Toyota",4));
        listados.add(new Automovil(200,"Nissan",4));
        listados.add(new Automovil(300,"Ford",4));
        listados.add(new Automovil(100,"Dfsk",4));

        for (int i = 0 ; i<listados.size(); i++){
            System.out.println("auto : " + listados.get(i).getModelo());
        }

        for (Automovil auto : listados){
            System.out.println("auto : " + auto.getModelo());
        }

        List<Triangulo> list = new ArrayList<Triangulo>();

        list.add(new Triangulo(2,3,"rojo"));
        list.add(new Triangulo(1,7,"celeste"));
        list.add(new Triangulo(4,6,"amraiilo"));
        list.add(new Triangulo(5,8,"azul"));


        for (int i = 0 ; i<list.size(); i++){
            System.out.println("Triangulo : " + list.get(i).getAltura());
        }

        for (Triangulo triangulo : list){
            System.out.println("Triangulo : " + triangulo.getBase());

        }

        List<Animales> animales = new ArrayList<Animales>();

        animales.add(new Animales("Leon" , "Felino",5));
        animales.add(new Animales("Tigre" , "Mamifero",3));

        for (int i = 0 ; i<animales.size(); i++){
            System.out.println("animales : " +animales.get(i).getEdad());
        }

        for (Animales animal : animales){
            System.out.println("animales : " + animal.getNombre());
        }

        List<Ventana> ventana = new ArrayList<Ventana>();

        ventana.add(new Ventana(4 , "Celeste" , 190));
        ventana.add(new Ventana(6 , "Azul" , 100));

        for (Ventana value : ventana) {
            System.out.println("Ventana : " + value.getPerimetro());
        }
        for (Ventana ven : ventana){
            System.out.println("ventana : " + ven.getColor());
        }

        List<Artefactos> arte = new ArrayList<Artefactos>();
        arte.add(new Artefactos("Samsung" , 3 , "Rojo"));
        arte.add(new Artefactos("LG" , 1 , "Negro"));

        for (int i = 0 ; i<arte.size() ;i++){
            System.out.println("Artefacto :  " + arte.get(i).getModelo());
        }

        for (Artefactos artes: arte){
            System.out.println("Artefactos : " + artes.getColor());
        }

        List<Fierro> fierros = new ArrayList<Fierro>();

        fierros.add(new Fierro("arequipa","Rocass",489));
        fierros.add(new Fierro("Siderpertu","Farta",320));

        for (int i = 0 ; i<fierros.size();i++){
            System.out.println("Fierros : " +fierros.get(i).getModelo());
        }
        for (Fierro fie : fierros){
            System.out.println("Fierrros : " + fie.getMarca());
        }

        List<Casa> casa = new ArrayList<Casa>();
        casa.add(new Casa("Rojo",4,"Bonito"));
        casa.add(new Casa("Azul",1,"Hermoso"));

        for (int i = 0 ; i<casa.size();i++){
            System.out.println("casa : " +casa.get(i).getModelo());
        }
        for (Casa c : casa){
            System.out.println("casa : " + c.getModelo() );
        }
    }

}