import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pin1;
        String pin2;

        do {
            System.out.print("Introduce un PIN de 4 números: ");
            pin1 = sc.nextLine();
        } while (!pin1.matches("\\d{4}"));

        System.out.print("Repite el PIN: ");
        pin2 = sc.nextLine();

        if (pin1.equals(pin2)) {
            System.out.println("PIN correcto");
        } else {
            System.out.println("Los PIN no coinciden");
        }
    }
}