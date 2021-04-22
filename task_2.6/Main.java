import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scan.nextInt();
        System.out.print("Введите число b: ");
        int b = scan.nextInt();
        int c = a%b;
        if (c!=0) {
            System.out.println("Делиться с остатком:  "+c);
        } else {
            System.out.println("Делиться, без остатка:  " +(a/b));
        }
    }
}
