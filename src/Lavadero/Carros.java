package Lavadero;

public class Carros {
    String placa;
    String marca;
    int puertas;
    public Carros (String placa, String marca, int puertas){
        this.placa=placa;
        this.marca=marca;
        this.puertas=puertas;
    }
    public String informacion(){
        return "placa: "+placa+",marca: "+marca+",puertas:"+puertas ;
    }
}
