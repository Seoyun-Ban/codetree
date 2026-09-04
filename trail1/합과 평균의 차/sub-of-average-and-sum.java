import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int total = a + b + c;

        System.out.println(total);
        System.out.println(total / 3);
        System.out.println(total - (total / 3));
    }
}