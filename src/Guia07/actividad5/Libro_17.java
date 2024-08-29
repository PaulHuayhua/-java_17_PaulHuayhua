package Guia07.actividad5;

public class Libro_17 {

    String nombre;
    int añoPublicacion;
    String autor;

    public Libro_17(String nombre, int añoPublicacion, String autor) {
        this.nombre = nombre;
        this.añoPublicacion = añoPublicacion;
        this.autor = autor;
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Año de Publicación: " + añoPublicacion);
        System.out.println("Autor: " + autor);
    }
}
