public class Main {

    public static void main(String[] args) {
String words []= {"Мама","Мыла","Раму"};
        for (int Мама=0;Мама<3;Мама++)
        for (int Мыла=0;Мыла<3;Мыла++)
        if (Мама!=Мыла)
        System.out.println(words[Мама]+" "+words[Мыла]+" "+words[3-Мама-Мыла]);
    }
}
