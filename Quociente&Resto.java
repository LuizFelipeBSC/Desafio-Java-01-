import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);

        int A = ler.nextInt();
        int B = ler.nextInt();

        System.out.println("O quociente da divisão: " + A / B);
        System.out.println("O resto: " + A % B);

 
    }
}
