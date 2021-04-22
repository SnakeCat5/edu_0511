import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scan.nextInt();
        if (number == 10) {
            System.out.println("Это верное число");
        } else {
            System.out.println("Это не верное число");
        }
    }
}
