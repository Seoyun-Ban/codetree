import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        String[] strArr = number.split("-");
        System.out.print(strArr[0] + strArr[1]);
    }
}