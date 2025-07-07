package SIMPLES;

import java.util.Scanner;

public class EJE8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float saldo = 1000.0f;
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE CAJERO ===");
            System.out.println("1: Revisar estado de la cuenta");
            System.out.println("2: Retirar dinero");
            System.out.println("3: Depositar dinero");
            System.out.println("4: Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Tu saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.print("¿Cuánto deseas retirar?: ");
                    float retiro = sc.nextFloat();
                    if (retiro > saldo) {
                        System.out.println("Fondos insuficientes.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    }
                    break;
                case 3:
                    System.out.print("¿Cuánto deseas depositar?: ");
                    float deposito = sc.nextFloat();
                    saldo += deposito;
                    System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }
}
