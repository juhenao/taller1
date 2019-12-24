import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        /* // Instancio los patos
        Silvestre patoDonald = new Silvestre();
        Silvestre patoHenao = new Silvestre();
        Hierro ironPato = new Hierro();
        Hierro oxiPato = new Hierro();
        Madera pinochiPato = new Madera();
        Madera hoodPato = new Madera();
        Hule durexPato = new Hule();
        Hule duoPato = new Hule();
        // Clase abstracta
        WarnerdDuck patoLucas = new WarnerdDuck();
        ComicDuck lucas = new WarnerdDuck();


        // TODO: De las clases obastractas no se pueden crear instancias porque tienen metodos abstractos
        /* ComicDuck comic = new ComicDuck() {
            @Override
            public void doBoom() {

            }

            @Override
            public void doFly() {

            }
        }

        // Creo un array dinamico para almacenar los patos
        ArrayList<Pato> allDuck = new ArrayList<>();

        // Agrego los patos al array
        allDuck.add(patoDonald);
        allDuck.add(patoHenao);
        allDuck.add(ironPato);
        allDuck.add(oxiPato);
        allDuck.add(pinochiPato);
        allDuck.add(hoodPato);
        allDuck.add(durexPato);
        allDuck.add(duoPato);
        // Clase abstracta
        allDuck.add(patoLucas);

        // Se recorre el array con un for each
        for (Pato pato: allDuck) {
            System.out.println(pato);
        }

        // TODO: Agregar los comportamientos de los patos llamados desde las interfaces

        // Se crea otro array dinamico para almacenar los metodos
        ArrayList<Swimable> swimDuck = new ArrayList<>();

        // Agregamos los valores al array
        swimDuck.add(patoDonald);
        swimDuck.add(patoHenao);
        swimDuck.add(pinochiPato);
        swimDuck.add(hoodPato);
        swimDuck.add(durexPato);
        swimDuck.add(duoPato);

        // Imprimimos las acciones de la interface Swimable
        for (Swimable nadar: swimDuck) {
            nadar.doSwim();
        }

        // Se crea el array dinamico para los patos que hacen cuack
        ArrayList<Cuackable> cuackables = new ArrayList<>();
        cuackables.add(patoDonald);
        cuackables.add(patoHenao);
        cuackables.add(durexPato);
        cuackables.add(duoPato);

        // Imprimir el array dinamico para los patos que hacen cuack
        for(Cuackable cuack : cuackables){
            cuack.doCuack();
        }

        // Crear un array dinamico para los patos que vuelan
        ArrayList<Flyable> flyables = new ArrayList<>();
        flyables.add(patoDonald);
        flyables.add(patoHenao);
        flyables.add(patoLucas);

        // Imprimir los patos que vuelan
        for(Flyable volar: flyables){
            volar.doFly();
        } */

        // TODO: Excepciones (try/catch ~ propagación de excepcion)
        /* int a = 10;
        int b = 0;
        int c = 0;

        try{
            c = a / b;
        } catch (ArithmeticException ae){
            System.err.println("Que estupido enserio xD " + ae);
        } finally {
            System.out.println("Si o si,  vas a pasar por acá");
        }*/

        /* Matematicas m = new Matematicas();
        try{
            m.division(5,0);
        } catch (ArithmeticException ae){
            System.out.println("Error extraño " + ae);
            System.out.println(ae.getMessage());
        } finally {
            System.out.println("Otra vez pasaste por acá");
        } */

        Gamin laChirly = new Gamin();
        try{
            laChirly.patearBalon(true, "Vrallan");
        } catch (VentanaRotaException vre){
            System.out.println("La Chirly me rompió la put** ventana: " + vre);
        } catch (Exception e){
            System.out.println("El nombre del gamin es null");
        }

    }
}
