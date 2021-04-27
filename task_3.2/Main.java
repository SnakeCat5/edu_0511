public class Main {
    public static int min(int a, int b, int c, int d) {
        int m1;
        int m2;
        int m3;
        if (a < b)
            m1 = a;
        else
            m1 = b;
        if (c < d)
            m2 = c;
        else
            m2 = d;
        if (m1 < m2)
            m3 = m1;
        else
            m3 = m2;
        return m3;
    }

    public static int min(int a, int b) {
        int m2;
        if (a < b)
            m2 = a;
        else
            m2 = b;

        return m2;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
