import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva o numero: ");
        int valor = ler.nextInt();
        int valor2 = valor % 2;
        if (valor2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Inpar");
        }

    }
}
