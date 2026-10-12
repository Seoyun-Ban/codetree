import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++){
            int a = sc.nextInt();
            if (a % 2 != 0 && a % 3 == 0){
                sum += a;
            }
        }
        System.out.print(sum);
    }
}