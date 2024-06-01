package ejerciciosJava;

import java.util.Random;
import java.util.Scanner;

public class DesafioJuegoDeAdivinacion {

    public static void main(String[] args) {

        int intentos = 0;
        int numero = 0;
        int adivinarNumero = new Random().nextInt(100) +1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenid@ Al Juego De Adivinanzas");
        System.out.println("Debe intenar adivinar el número en un máximo de 5 intentos");

        while (intentos < 5) {
            System.out.println("Por favor ingrese un número del 0 al 100: ");
            numero = teclado.nextInt();

            if (numero < adivinarNumero) {
                System.out.println("El número es mayor");
            } else if (numero > adivinarNumero) {
                System.out.println("El número es menor");
            } else {
                System.out.println("¡Felicidades Adivinaste! El número es: " + adivinarNumero);
                break;
            }
            intentos++;

            if (intentos == 5){
                System.out.println("¡Perdiste! El número era: " + adivinarNumero);
            }
        }

    }
}
