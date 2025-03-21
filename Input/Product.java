package Input;

// import java.util.*;
// public class Product {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two numbers : ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int Product = a*b;
//         System.out.println("Product is " + Product);
//         sc.close();
//     }
// }


//Area of circle
import java.util.*;
public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius");
        float radius = sc.nextFloat();
        float Area = 3.14f*radius*radius;
        System.out.println(Area);
        sc.close();
    }
}
