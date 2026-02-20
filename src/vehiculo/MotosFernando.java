package vehiculo;

public class MotosFernando {
    int cilindraje;
    String placa;
    String color;
    public MotosFernando(int cilindraje, String placa, String color)
    {
        this.cilindraje=cilindraje;
        this.placa=placa;
        this.color=color;
    }
    public String matar (String nombre)
    {
        return "mate a "+nombre;
    }
}
