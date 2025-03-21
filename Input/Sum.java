package Input;

// public class Sum {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 5;
//         int sum = a+b;
//         System.out.println(sum);
//     }
// }

import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Sum = a + b;
        System.out.println(Sum);
        sc.close();
    }
}