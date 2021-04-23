public class Main {
    public static void main(String[] args) {
        int [] arr = {10, 1, 1, 12, 56, 23, 1};
        for (int i = 0; i < arr.length; i++) {
                if (arr[i]+arr[i] > 10) {
                    System.out.println(" "+(i+1)+" число можно сложить со следующим чилом и получится сумму больше 10-ти");
                }
            }
        }
    }
