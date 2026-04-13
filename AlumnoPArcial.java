package PRoyectos;

import java.util.Scanner;

public class AlumnoPArcial {
    public static void main(String[] args){
        //crear un scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);;;
        //pedir al usuario que ingrese las notas
        System.out.println("Ingrese la nota del primer parcial:");
        double nota1 = scanner.nextDouble();
        System.out.println("Ingrese la nota del segundo parcial:");
        double nota2 = scanner.nextDouble();
        System.out.println("Ingrese la nota del tercer parcial");
        double nota3 = scanner.nextDouble();

        //calcular el promedio
        double promedio = (nota1 + nota2 + nota3) / 3;
        //verificiar si promociona
        if (promedio >= 8) {
            System.out.println("El alumno esta peomocionado");
        } else {
            System.out.println("EL alumno no esta promocionado");
        }
        //Mostrar el promedio
        System.out.println("promedio:" + promedio);
    }
}
