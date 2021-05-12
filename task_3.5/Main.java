public class Main {
    public static void main(String[] args) {
        int num[] = {4,2,6,2,65};
         recursion(0, num);
         }
public static void recursion (int n, int[] ar){
        System.out.println(ar[n]);
        if(n < (ar.length-1)) {
        recursion(n+1, ar);
        }
        }}
