package core;

public class ForEach {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int a : array1){
            sum = sum + a;
        }
        System.out.println(sum);
    }
}
