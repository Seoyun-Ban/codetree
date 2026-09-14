import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sex = sc.nextInt();
        int age = sc.nextInt();

        if (age >= 19){
            if (sex == 1){
                System.out.print("WOMAN");
            }
            else{
                System.out.print("MAN");
            }
        }
        else{
            if (sex == 1){
                System.out.print("GIRL");
            }
            else{
                System.out.print("BOY");
            }
        }
    }
}