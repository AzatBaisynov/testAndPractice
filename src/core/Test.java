package core;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("проверяем тернарный оператор:\n" +
                "чтобы закончить а или b должны быть = 0\n" +
                "введите число а и число b:");

        while (1 > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            String result = (a > b) ? "a > b" : "a < b";
            System.out.println(result);
            if (a == 0 || b == 0){
                break;
            }
        }

    }
}
