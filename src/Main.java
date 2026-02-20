import vehiculo.MotosFernando;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Nueva Version");
        int numero = 77777;
        String nombre = "FernandoToledo";
        char sexo = 'M';
        boolean vivo = true;
        MotosFernando laNegra = new MotosFernando(1500,"RPM333", "ROJO");
        System.out.println("Se creo la Negra");
        System.out.println(laNegra.matar("roberto"));
        System.out.println(laNegra.matar(nombre));
    }
}
