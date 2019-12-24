public class VentanaRotaException extends Exception{
    public VentanaRotaException(String nombreGamin) {
        super("Rompiste la maldita ventana!!! " + nombreGamin);
    }
}
