/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
Требования:
•	Создай класс Dog.
•	Создай класс Cat.
•	В классе Dog должно быть три переменные.
•	В классе Cat должно быть три переменные.
•	Должен быть создан хотя бы один объект типа Mouse.
•	Должен быть создан хотя бы один объект типа Dog.
•	Должен быть создан хотя бы один объект типа Cat.
*/

public class Main {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog spikeDog = new Dog("Spike", 35, 10);
        Cat tomCat = new Cat("Tom", 25, 15);
        //напишите тут ваш код
    }
}
class Mouse {
    String имя;
    int высота;
    int длинаХвост;

    public Mouse(String имя, int высота, int длинаХвоста) {
        this.имя = имя;
        this.высота = высота;
        this.длинаХвост = длинаХвоста;
    }
}
class Cat {
    String имя;
    int высота;
    int длинаХвоста;

    public Cat(String name, int height, int длинаХвоста) {
        this.имя = name;
        this.высота = height;
        this.длинаХвоста = длинаХвоста;
    }
}

class Dog {
    String имя;
    int высота;
    int длинаХвоста;

    public Dog(String имя, int высота, int длинаХвоста) {
        this.имя = имя;
        this.высота = высота;
        this.длинаХвоста = длинаХвоста;
    }
}
