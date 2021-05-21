/*
* Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
* Коллекции вы создаёте сами
*/
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> целыечисла = new ArrayList<>();
        целыечисла.add(22);
        целыечисла.add(13);
        целыечисла.add(5);
        целыечисла.add(18);
        целыечисла.add(54);
        целыечисла.add(2);
        целыечисла.add(8);
        System.out.println(целыечисла);
        целыечисла.removeIf(i -> (i > 10));
        System.out.println(целыечисла);
    }
}
