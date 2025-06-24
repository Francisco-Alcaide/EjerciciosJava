package SIMPLES;

import java.util.Scanner;

public class EJE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el primer número: ");
        float num1 = sc.nextFloat();

        System.out.println("Digite el segundo número: ");
        float numero2 = sc.nextFloat();

        float res = num1 * numero2;
        System.out.println("El resultado de la multiplicación es: " + res);
    }
}
