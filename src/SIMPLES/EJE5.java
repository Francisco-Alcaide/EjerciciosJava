package SIMPLES;

import java.util.Scanner;

public class EJE5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int num3 = sc.nextInt();

        if (num1 == num2 && num2 == num3) {
                    System.out.println("Los tres números son iguales.");
        } else if (num1 >= num2 && num1 >= num3) {
            if ((num1 == num2) || (num1 == num3)) {
                        System.out.println("El número mayor es: " + num1 + " (hay empate)");
            } else {
                        System.out.println("El número mayor es: " + num1);
                    }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num2 == num3) {
                        System.out.println("El número mayor es: " + num2 + " (hay empate)");
            } else {
                        System.out.println("El número mayor es: " + num2);
            }
        } else {
                    System.out.println("El número mayor es: " + num3);
        }
    }
}
