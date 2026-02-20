package Lavadero;

import vehiculo.MotosFernando;

import java.lang.reflect.Array;

public class Main {
        static Carros [] lavadero = new Carros[10];
    public static void main(String[] args) {
        int espacios = 10;

        // Array (arreglo)
        Carros carroFernando = new Carros("RPP333", "FORD", 4);
        Carros carroEdgar = new Carros("PPP888", "FORD", 5);
        Carros carroToledo = new Carros("QQQ888", "FORD", 2);
        Carros carroAlejandra = new Carros("TTT888", "FORD", 4);
        Carros carroMariana = new Carros("YYY888", "FORD", 4);
        Carros carroYolanda = new Carros("OOO888", "FORD", 5);
        Carros carroDaniel = new Carros("MMM888", "FORD", 4);
        Carros carroJeison = new Carros("GGG888", "FORD", 3);
        Carros carroJuanita = new Carros("FFF888", "FORD", 4);
        Carros carroisabel = new Carros("JJJ888", "FORD", 5);
        Carros carroLaura = new Carros("LLL888", "FORD", 4);
        ingresarVehiculo(carroFernando);
        ingresarVehiculo(carroEdgar);
        ingresarVehiculo(carroToledo);
        ingresarVehiculo(carroAlejandra);
        ingresarVehiculo(carroMariana);
        ingresarVehiculo(carroYolanda);
        imprimirParqueadero();
        ingresarVehiculo(carroDaniel);
        ingresarVehiculo(carroJeison);
        ingresarVehiculo(carroJuanita);
        ingresarVehiculo(carroisabel);
        ingresarVehiculo(carroLaura);
        imprimirParqueadero();
        salidaVehiculo("RPP333");
        imprimirParqueadero();
        Carros carrojuan = new Carros("WWW789", "FORD", 4);
        ingresarVehiculo(carrojuan);
        imprimirParqueadero();
        salidaVehiculo("FPP399");
        imprimirParqueadero();
        System.out.println(lavadero);
        System.out.println(lavadero.toString());
    }
    // Metodo para ingresar un vehiculo al lavadero
    public static boolean ingresarVehiculo(Carros pichiriloMetodo) {
        for (int i = 0; i < lavadero.length; i++) {
            if (lavadero[i]==null){
                lavadero[i]=pichiriloMetodo;
                System.out.println("carro ingreso correctamente");
                return true;
            }
        }
        System.out.println("lavadero ya ocupado");
        return false;
    }
    public static boolean salidaVehiculo (String placa){
        for (int i = 0; i < lavadero.length; i++) {
            {
                if (lavadero[i]!=null && lavadero[i].placa.equals(placa)){
                lavadero[i]=null;
                System.out.println("salida exitosa");
                return true;
                }
            }
        }
        System.out.println("el carro no existe");
        return false;
    }
    public static void imprimirParqueadero(){
        for (int i = 0; i < lavadero.length; i++) {
            if (lavadero[i]!=null){
            System.out.println("parqueadero en posicion"+i+","+lavadero[i].informacion());
        }
            else {
                System.out.println("parqueadero en posicion:"+i+" vacia");
            }
    }
    }
}