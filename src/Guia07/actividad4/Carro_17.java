package Guia07.actividad4;

public class Carro_17 {
    String marca;
    int velocidad;
    String color;

    public Carro_17(String marca, int velocidad, String color) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.color = color;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("Color: " + color);
    }
}
