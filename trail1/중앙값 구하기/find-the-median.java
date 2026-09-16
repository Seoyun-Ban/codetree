import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();

        if ((A > B && B > C) || (C > B && B > A)){
            System.out.print(B);
        }
        if ((A < B && A > C) || (B < A && A < C)){
            System.out.print(A);
        }
        if ((B < C && C < A) || (A < C && C < B)){
            System.out.print(C);
        }
    }
}