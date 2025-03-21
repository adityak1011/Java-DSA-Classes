package JavaBasics;

public class Scope {
    // public static void main(String[] args) {
    //     int s = 45;
    //     System.out.println(s);
    // }

    public static void main(String[] args) {
        {
            int s = 45;
            System.out.println(s);
        }
    }
}
