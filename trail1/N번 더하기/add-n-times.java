import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), N = sc.nextInt();
        int sum = A;
        
        for (int i = 1; i <= N; i++){
            sum += N;
            System.out.println(sum);
        }
    }
}