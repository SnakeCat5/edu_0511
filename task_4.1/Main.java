public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Безымянный кот");
        System.out.println(cat.setName("Имя кота"));
    }
}

class Cat {
    private String name = "безымянный кот";

    public String setName(String name){
        return (this.name = "Барсик");
    }
    public boolean getName(){
        return false;
    }
}
