import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char man1_symptom = sc.next().charAt(0);
        int man1_temperature = sc.nextInt();
        char man2_symptom = sc.next().charAt(0);
        int man2_temperature = sc.nextInt();
        char man3_symptom = sc.next().charAt(0);
        int man3_temperature = sc.nextInt();
        int A_num = 0;

        if (man1_symptom == 'Y' && man1_temperature >= 37){
            A_num += 1;
        }
        if (man2_symptom == 'Y' && man2_temperature >= 37){
            A_num += 1;
        }
        if (man3_symptom == 'Y' && man3_temperature >= 37){
            A_num += 1;
        }

        if (A_num >= 2){
            System.out.print("E");
        }
        else{
            System.out.print("N");
        }
    }
}