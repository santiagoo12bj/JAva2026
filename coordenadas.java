package PRoyectos;

import java.util.Scanner;

public class coordenadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la coordenada X:");
        int x = scanner.nextInt();
        System.out.println("Ingrese la coordenada Y:");
        int y = scanner.nextInt();

        System.out.println("x: " + x + ", y: " + y);

        if (x == 0 || y == 0) {
            System.out.println("Las coordenadas no pueden ser cero");
        } else {
            if (x > 0 && y > 0) {
                System.out.println("El punto se ubica en el 1er Cuadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("El punto se ubica en el 2do Cuadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("El punto se ubica en el 3er Cuadrante");
            } else {
                System.out.println("El punto se ubica en el 4to Cuadrante");

            }

        }
    }}

