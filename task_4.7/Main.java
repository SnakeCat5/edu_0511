/*
Реализуй в классе Fox интерфейс Animal.
Поменяй код так, чтобы в классе Fox был только один метод - getName.
Учти, что создавать дополнительные классы и удалять методы нельзя!

Требования:
•	Интерфейс Animal должен быть реализован в классе Fox.
•	В классе Fox должен быть реализован только один метод (getName).
•	В интерфейсе Animal нужно объявить метод getColor.
•	Дополнительные классы или интерфейсы создавать нельзя.
*/

import java.awt.Color;

public class Main {
    public static void main(String[] args){

    }
}
interface Animal {
    Color getColor();
}
class Fox implements Animal {
    public Color getColor(){
        return Color.orange;
    }
    public String getName() {
        return "Fox";
    }
}
