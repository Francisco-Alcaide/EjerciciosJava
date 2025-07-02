package SIMPLES;

import java.util.Scanner;

public class EJE7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float saldo = 100000.0f;

        System.out.println("SELECCIONE UNA OPCION: ");
        System.out.println("1: Revisar estado de la cuenta: ");
        System.out.println("2: Retirar dinero: ");
        System.out.println("3: Depositar dinero ");
         int opcion = sc.nextInt();
         switch (opcion) {
             case 1:
                 System.out.println("Tu saldo es: " + saldo);
                 break;
             case 2:
                 System.out.println("Cuanto vas a retirar?: " + saldo);
                 float retiro = sc.nextFloat();
                 if (retiro > saldo) {
                     System.out.println("Fondos insuficientes.");

                 }else  {
                     saldo -= retiro;
                     System.out.println("Retiro exitoso. Nuevo saldo:" + saldo);
                 }
                 break;
                 case 3:
                     System.out.println("Cuanto vas a depositar?: ");
                     float deposito = sc.nextFloat();
                     saldo += deposito;
                     System.out.println("Deposito exitoso. Nuevo saldo:" + saldo);
                     break;
             default:
                 System.out.println("Opcion no valida");

         }


    }
}
