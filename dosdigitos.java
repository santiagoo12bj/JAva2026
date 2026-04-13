package PRoyectos;

import java.util.Scanner;

public class dosdigitos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numero positivo de uno o dos digitos (1...99):");
        int numero = scanner.nextInt();

        if (numero < 1 || numero >=100) {
            System.out.println("Numero invalido");
        } else if (numero < 10) {
            System.out.println("El numero tiene un digito");
        } else {
            System.out.println("El numero tiene dos digitos");
        }
    }
    }

