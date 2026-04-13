import java.util.Scanner;

class NotaAlumno {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    // Pedir al usuario que ingrese la nota del alumno
    System.out.println("Ingrese la nota del alumno (0-10):");
    double nota = scanner.nextDouble();
    // Verificar la nota del alumno
        if (nota < 4) {
            System.out.println("desaprobado");
        } else if (nota >=4 && nota < 10) {
            System.out.println("aprobado");
        } else if (nota == 10) {
            System.out.println("Sobresaliente");

        }
    }


    }

