public class Main {

    public static void main(String[] args) {
String words []= {"Мама","Мыла","Раму"};
        for (int мама=0;мама<3;мама++)
        for (int мыла=0;мыла<3;мыла++)
        if (мама!=мыла)
        System.out.println(words[мама]+" "+words[мыла]+" "+words[3-мама-мыла]);
    }
}
