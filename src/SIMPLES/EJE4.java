package SIMPLES;

import java.util.Scanner;

public class EJE4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        float numero1 = sc.nextFloat();

        System.out.println("Escribe el segundo numero: ");
        float numero2 = sc.nextFloat();

        System.out.println("Elige una operación (+,-,*,/): ");
        char op = sc.next().charAt(0);

        float resultado;

        if (op == '+') {
            resultado = numero1 + numero2;
            System.out.println("El resultado es: " + resultado);
        } else if (op == '-') {
            resultado = numero1 - numero2;
            System.out.println("El resultado es: " + resultado);
        } else if (op == '*') {
            resultado = numero1 * numero2;
            System.out.println("El resultado es: " + resultado);
        } else if (op == '/') {
            if (numero2 == 0) {
                System.out.println("El resultado no se puede dividir: 0");
            } else {
                resultado = numero1 / numero2;
                System.out.println("El resultado es: " + resultado);
            }
        } else {
            System.out.println("Operacion no valida");
        }

    }
}

