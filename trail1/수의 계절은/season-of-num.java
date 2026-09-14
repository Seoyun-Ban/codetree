import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();

        if (M >= 3 && M <= 5){
            System.out.print("Spring");
        }
        if (M >= 6 && M <= 8){
            System.out.print("Summer");
        }
        if (M >= 9 && M <= 11){
            System.out.print("Fall");
        }
        if (M == 12 || M <= 2){
            System.out.print("Winter");
        }
    }
}