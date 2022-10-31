import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos dias você viveu: ");
        int dias = ler.nextInt();
        int idade = dias / 365;
        int meses = idade * 12;
        System.out.println("Ano: " + idade + "|" + "Meses: " + meses + "|" + "Dias: " + dias);

    }
}
