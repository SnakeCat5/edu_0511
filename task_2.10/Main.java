public class Main {
    public static void main(String[] args) {
        int [] arr = {3, 1, 1, 12, 56, 23, 1};
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr[i+1]) {
                    System.out.println("за ним такое же число " +arr[i]);
                } else {
                    System.out.println("следующее число не такое же "+arr[i]);
                }
            }
        }
    }
