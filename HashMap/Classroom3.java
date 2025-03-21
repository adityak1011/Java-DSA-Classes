import java.util.*;

public class Classroom3 {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);

        HashMap<String, Integer> hm = new LinkedHashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);
        System.out.println(tm);
    }
}