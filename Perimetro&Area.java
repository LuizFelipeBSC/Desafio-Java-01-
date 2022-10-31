import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual a altura: ");
        int altura = ler.nextInt();
        System.out.println("Qual a base: ");
        int base = ler.nextInt();

        int area = altura * base;

        int perimetro = 2 * (base + altura);
        System.out.println("A área e: " + area);
        System.out.println("O perimetro e: " + perimetro);

    }
}
