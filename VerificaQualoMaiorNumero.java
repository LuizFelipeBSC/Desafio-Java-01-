import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Primeiro Numero: ");
        int A = ler.nextInt();
        System.out.println("Segundo Numero: ");
        int B = ler.nextInt();
        System.out.println("Terceiro Numero: ");
        int C = ler.nextInt();

        if (A > B && A > C) {
            System.out.println(A);
        } else if (B > C) {
            System.out.println(B);
        } else {
            System.out.println(C);
        }
    }
}
