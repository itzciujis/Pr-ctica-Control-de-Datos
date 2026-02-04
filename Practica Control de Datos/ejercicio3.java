import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Día: ");
        int dia = sc.nextInt();

        System.out.print("Mes: ");
        int mes = sc.nextInt();

        System.out.print("Año: ");
        int anio = sc.nextInt();

        boolean fechaValida = true;

        if (anio < 1 || mes < 1 || mes > 12 || dia < 1) {
            fechaValida = false;
        } else {
            int diasMes;

            switch (mes) {
                case 4, 6, 9, 11 -> diasMes = 30;
                case 2 -> {
                    if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
                        diasMes = 29;
                    } else {
                        diasMes = 28;
                    }
                }
                default -> diasMes = 31;
            }

            if (dia > diasMes) {
                fechaValida = false;
            }
        }

        if (fechaValida) {
            System.out.println("Fecha válida");
        } else {
            System.out.println("Fecha NO válida");
        }
    }
}