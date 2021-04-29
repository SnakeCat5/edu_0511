import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите число a: ");
            int a = scan.nextInt();
            System.out.print("Введите число b: ");
            int b = scan.nextInt();
            if (a+b>10 ) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Введенный элемент не являеться числом") ;
        }
    }
}
