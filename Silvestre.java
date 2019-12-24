public class Silvestre extends Pato implements Cuackable, Swimable, Flyable {
    @Override
    public void doCuack() {
        System.out.println("Un pato asesino haciendo cuack");
    }

    @Override
    public void doFly() {
        System.out.println("Un pato asesino volando");
    }

    @Override
    public void doSwim() {
        System.out.println("Un pato asesino nadando");
    }
}
