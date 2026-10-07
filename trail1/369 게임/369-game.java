import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++){
            String str = String.valueOf(i);

            if (i % 3 == 0 || str.contains("3") || str.contains("6") || str.contains("9")){
                System.out.print(0 + " ");
            }
            else{
                System.out.print(i + " ");
            }
        }
    }
}