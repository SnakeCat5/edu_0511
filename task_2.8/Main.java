public class Main {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5};
        int compos = 1 ;
        for (int i=0; i<nums.length; i++) {
            compos = compos * nums[i];
        }
        System.out.println("Произвединие элеметов массива будет: "+compos);
    }
}
