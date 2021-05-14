/*
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Dog должна быть переменная name с типом String.
•	У класса Dog должна быть переменная age с типом int.
•	У класса должен быть сеттер для переменной name.
•	У класса должен быть геттер для переменной name.
•	У класса должен быть сеттер для переменной age.
•	У класса должен быть геттер для переменной age.
*/
public class Dog<age> {
    public static int age;
    private static String name;


    Dog() {
        this(getName(),age);
    }

    Dog(String name, int age ) {
        this.age = age;
        this.setName(name);
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        name = name;
    }

    public class Dog {
        public String name;
        public int age;//добавьте переменные класса тут

        public String getName() {
            return name;
        }

        public void setName(String name) {
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }
}
