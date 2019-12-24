public abstract class ComicDuck extends Pato implements Flyable{
    // TODO: Tengo un metodo abstracto que se toman de la interface Flyable
    // TODO: Las clases abstractas tambien me permiten agregar metodos normales
    // TODO: Las clases abstractas sirven cuando no quiero cumplir el contrato (las interfaces)

    public abstract void doBoom();

    public void doZap(){
        System.out.println("Hace ZAP desde un ComicDuck");
    }
}
