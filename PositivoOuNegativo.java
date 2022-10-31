import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva um valor: ");
        int valor = ler.nextInt();

        if (valor >= 1) {
            System.out.println("O valor e positivo");
        } else if (valor <= -1) {
            System.out.println("O valor e negativo");
        }

    }
}
