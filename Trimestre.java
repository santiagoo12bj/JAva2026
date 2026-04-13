package PRoyectos;

import java.util.Scanner;

public class Trimestre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresse el dia:");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el año");
        int año = scanner.nextInt();

        if (esFechaValida(dia, mes, año)) {
            verificarTrimestre(mes);
        } else {
            System.out.println("fecha invalida");
        }
    }
  private static boolean esFechaValida(int dia,int mes, int año) {
        System.out.println("Verificando fecha: " + dia + "/" + mes + "/" + año);
      if (año <= 0) {
        System.out.println("Año invalido");
          return false;
      }
      if (mes < 1 || mes >12){
          System.out.println("Mes invalido");
          return false;
      }
      int diasEnMes = diasEnMes(mes , año);
      System.out.println("Dias en mes:" + diasEnMes);
      if (dia < 1 || dia > diasEnMes) {
          System.out.println("Dia invalido");
          return false;
      }
      return true;
  }
  private static int diasEnMes(int mes, int año){
        System.out.println("calculando dias en mes: " + mes);
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 2:
                if (esBisiesto(año)) {
                    System.out.println("Año bisiesto");
                    return 29;
                } else {
                    System.out.println("Año no bisiesto");
                    return 28;
                }
            default:
                return 0;
        }
  }
  private static boolean esBisiesto(int año){
        return (año % 4 == 0 && año % 100 !=0) || año % 400 == 0;
    }

    private static void verificarTrimestre(int mes) {
        switch ((mes - 1) / 3 ){
            case 0:
                System.out.println("La fecha corresponde al primer trimestre");
                break;
            case 1:
                System.out.println("la fecha corresponde al segundo cuatrimestre");
            case 2:
                System.out.println("la fecha corresponde al tercer trimestre del año");
            case 3:
                System.out.println("la fecha corresponde al cuarto trimestre del año");
        }
    }

}
