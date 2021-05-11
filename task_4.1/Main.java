public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}

class Cat {
    private String name = "безымянный кот";

    public String setName(String name) {
        this.name = setName(name);

        return name;
    }
}
