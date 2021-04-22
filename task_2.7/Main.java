import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scan.nextInt();
        int b;
        for (b = 1; b < a; b++) {
            int c = (a % b);
            if (c != 0) {
                System.out.println ("Число не делитья false:  "+b);
            } else {
                System.out.println ("Число делиться true:  " + (a / b));
            }
        }
    }
}
