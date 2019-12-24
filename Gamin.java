import com.sun.istack.internal.NotNull;

public class Gamin {
    public void patearBalon(boolean isBroke, String nombreGamin) throws VentanaRotaException, Exception {
        if (nombreGamin == null){
            throw new Exception("El nombre del gamin está en null");
        }
        if (isBroke){
            throw new VentanaRotaException(nombreGamin);
        }
    }
}
