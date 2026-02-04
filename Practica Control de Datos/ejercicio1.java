import java.util.Scanner;
import java.time.Year;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        if (edad >= 0 && edad <= 120) {
            System.out.println("Edad válida");
        } else {
            System.out.println("Edad NO válida");
        }

        System.out.print("Introduce un año: ");
        int anio = sc.nextInt();

        int anioActual = Year.now().getValue();

        if (anio >= 1900 && anio <= anioActual) {
            System.out.println("Año válido");
        } else {
            System.out.println("Año NO válido");
        }
    }
}