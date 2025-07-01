package SIMPLES;

import java.util.Scanner;

public class EJE6 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("MENÚ DE OPERACIONES");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.print("Elige una opción (1-4): ");
            int opcion = sc.nextInt();

            System.out.print("Ingresa el primer número: ");
            float num1 = sc.nextFloat();

            System.out.print("Ingresa el segundo número: ");
            float num2 = sc.nextFloat();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: "+ (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                    } else {
                        System.out.println("Resultado: " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
}


