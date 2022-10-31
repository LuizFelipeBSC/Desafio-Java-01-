import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C = 0;

        System.out.print(A);
        System.out.print(B);
        C = A;
        A = B;
        B = C;
        System.out.print(A);
        System.out.print(B);

    }
}
