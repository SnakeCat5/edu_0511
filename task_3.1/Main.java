public class Main {
    public static int min(int a, int b, int c) {
        int min = a ;
        if (a<=b && a<=c)
            min = a;
        else if (a>=b && b<=c)
            min =b;
        else if (c<=a && b>=c)
            min = c;
        return min;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}
