import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int min = 0;
        
        if (a <= b){
            if (a <= c){
                min = a;
            }
            else{
                min = c;
            }
        }
        else if (b <= c){
            min = b;
        }
        else{
            min = c;
        }
        
        System.out.print(min);
    }
}