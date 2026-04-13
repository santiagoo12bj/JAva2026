package PRoyectos;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de triangulos:");
        int n = scanner.nextInt();

        int equilatero = 0;
        int isosceles = 0;
        int escaleno = 0;

        for (int i = 0 ; i < n; i++) {
            System.out.println("Ingrese los lados del triangulo" + (i + 1) + ":");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a == b && b == c) {
                equilatero++;
            } else if (a == b || b == c || a ==c) {
                isosceles++;
            } else {
                escaleno++;

            }
        }
        System.out.println("Resultados:");
        System.out.println("Equilateros: " + equilatero);
        System.out.println("Isosceles: " + isosceles);
        System.out.println("Escalenos: " + escaleno);

        int min = Math.min(equilatero, Math.min(isosceles , escaleno));
        if (min == equilatero) {
            System.out.println("El tipo de triangulo on menor cantidad es equilatero");
        } else if (min == isosceles) {
            System.out.println("El tipo de triangulo con menor cantidad es isosceles");
        } else {
            System.out.println("El tipo de triangulo con menor cantidad es escaleno");

        }
        {
        }
    }
}

