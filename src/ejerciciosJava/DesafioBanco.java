package ejerciciosJava;

import java.util.Scanner;

public class DesafioBanco {

    public static void main(String[] args) {

        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        Double saldoDisponible = 159000.99;
        int opcion = 0;

        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("El tipo de cuenta es: " + tipoCuenta);
        System.out.println("Su saldo disponible es : " + saldoDisponible);

        String menu = """
                Escriba el número de la opcion deseada: 
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actual es: " + saldoDisponible);
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (saldoDisponible < valorARetirar) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldoDisponible -= valorARetirar;
                        System.out.println("El saldo actual es: " + saldoDisponible);
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es el valor que desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldoDisponible += valorADepositar;
                    System.out.println("El saldo actual es: " + saldoDisponible);
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestro servicios");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }
    }
}
