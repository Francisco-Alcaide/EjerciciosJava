package SIMPLES;

import java.util.Scanner;

public class EJE3 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingresa el primer número: ");
            float num1 = sc.nextFloat();

            System.out.print("Ingresa el segundo número: ");
            float num2 = sc.nextFloat();

            if (num2 == 0) {
                System.out.println("No se puede dividir por cero.");
            } else {
                float resultado = num1 / num2;
                System.out.println("El resultado de la división es: " + resultado);
            }
    }
}



