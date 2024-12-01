package f2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("--------------- BikeShop ---------------");
        System.out.println("1. Stock Crítico Simple");
        System.out.println("2. Stock Crítico Complejo");
        System.out.println("3. Salir");
        System.out.println("Ingrese opción:");
        int op = leer.nextInt();
        leer.nextLine();

        while (true) {
            switch (op) {
                case 1:
                    System.out.println("--------------- Stock Crítico Simple ---------------");
                    ICalculadoraStockSeguridad calculadoraSimple = new CalculadoraSimple();
                    calculadoraSimple.calcular();
                    break;
                case 2:
                    System.out.println("--------------- Stock Crítico Complejo ---------------");
                    ICalculadoraStockSeguridad calculadoraCompleja = new CalculadoraCompleja();
                    calculadoraCompleja.calcular();
                    break;
                case 3:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("--------------- BikeShop ---------------");
                    System.out.println("--------------- PROGRAMA TERMINADO ---------------");
                    System.out.println("--------------- VUELVA PRONTO ---------------");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            if (op == 3) {
                break;
            }
            System.out.println("--------------- BikeShop ---------------");
            System.out.println("1. Stock Crítico Simple");
            System.out.println("2. Stock Crítico Complejo");
            System.out.println("3. Salir");
            System.out.println("Ingrese opción:");
            op = leer.nextInt();
            leer.nextLine();
        }

    }
}
