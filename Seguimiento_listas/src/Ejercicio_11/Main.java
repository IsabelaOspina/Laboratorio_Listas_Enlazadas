package Ejercicio_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Polinomio polinomio = new Polinomio();

        System.out.println("=== INGRESO DEL POLINOMIO ===");
        System.out.print("Ingrese el número de términos: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nTérmino " + i + ":");
            System.out.print("Coeficiente: ");
            double coef = sc.nextDouble();
            System.out.print("Exponente: ");
            int exp = sc.nextInt();
            polinomio.agregarUltimo(coef, exp);
        }

        System.out.println("\nPolinomio ingresado:");
        polinomio.mostrar();

        System.out.println("\n=== TABLA DE VALORES ===");
        System.out.println("x\tP(x)");
        for (double x = 0.0; x <= 5.0; x += 0.5) {
            double resultado = polinomio.evaluar(x);
            System.out.printf("%.1f\t%.4f\n", x, resultado);
        }

        sc.close();
    }
}
