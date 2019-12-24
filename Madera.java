public class Madera extends Pato implements Swimable {
    @Override // Se está haciendo una sobre escritura del metodo.
    public void doSwim() {
        System.out.println("Nadando desde un pato de madera");
    }
}
