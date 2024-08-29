package Guia07.actividad3;

public class calculadora_17 {

    float numero1;
    float numero2;

    public calculadora_17(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float suma() {
        return numero1 + numero2;
    }

    public float resta() {
        return numero1 - numero2;
    }

    public float multiplicar() {
        return numero1 * numero2;
    }

    public float dividir() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("No se puede dividir entre cero");
            return 0;
        }
    }

    public void mostrarDatos() {
        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);
        System.out.println("Suma: " + suma());
        System.out.println("Resta: " + resta());
        System.out.println("Multiplicación: " + multiplicar());
        System.out.println("División: " + dividir());
    }
}
