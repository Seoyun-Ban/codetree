import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt(), E = sc.nextInt();

        if (A > B){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        if (A > C){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        if (A > D){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        if (A > E){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}