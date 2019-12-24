public class Pato {
    // TODO: Cuando agrego 'final' en la firma de la clase, a esta se le prohibe heredar
    // TODO: Si a un metodo le agrego el 'final' este no se puede sobre escribir (modificar el comportamiento)
    private String raza;
    private String color;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
