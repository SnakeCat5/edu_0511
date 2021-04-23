import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String порядковый[] = {"второй", "третий", "четвертый", "пятый", "шестой", "седьмой", "восьмой", "девятый", "десятый"};
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(scan.nextInt());
                System.out.println("Введите " + порядковый[i] + " элемент массива: ");
            int current = 1, max = 0;
            for (i = 1; i < arr.size(); i++) {
                if (arr.get(i).equals(arr.get(i - 1))) {
                    current++;
                    if (current > max) {
                       max = current; System.out.println("Наибольшее колличество последовательных чисел: " + max);
                    }
                } else {
                    current = 1;
                }
            }
        }
    }
}
