import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String[] strArr = date.split("\\.");

        System.out.print(strArr[1] + "-" + strArr[2] + "-" + strArr[0]);
    }
}