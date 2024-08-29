package Guia07.actividad2;

public class Persona_17 {
  String nombre;
  int telefono; 
  int edad;
  
  public void mostrarNombre() {
    System.out.println("Su nombre es " + nombre);
  }
  
  public void mostrarEdad() {
    System.out.println("Su edad es " + edad);
  }

  public void mostrarTelefono() {
    System.out.println("Su teléfono es " + telefono);
  }
  
  public void mostrarDatos() {
    mostrarNombre();
    mostrarEdad();
    mostrarTelefono();
  }
}