import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        {
            int[] a = new int[5];
            int i = 0;
            Scanner in = new Scanner(System.in);
            String times[] = {"первый ", "второй ", "третий ", "четвертый ", "пятый "};
            for (int j = 0; j < 5; j++) {
                 {
                    System.out.print("Введите " + (times[j]) + "элемент массива: ");
                    a[i] = in.nextInt();
                    if (a[i] == 5) {
                        System.out.println("Вы ввели правильное число это число: "+a[i]);
                    } else {
                        System.out.println("Нужное число не введено вы ввели: "+a[i]);
                    }
                }
            }
        }
    }
}
