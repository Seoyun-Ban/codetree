import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        int num = A / B;
        int spare = A % B;
        System.out.print(num + ".");
        
        for (int i = 0; i < 20; i++){
            spare *= 10;
            System.out.print(spare / B);
            spare %= B;
        }
    }
}