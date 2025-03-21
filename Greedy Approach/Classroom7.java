import java.util.*;

public class Classroom7 {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 }; // Vertical cuts (size m-1)
        Integer costHor[] = { 4, 1, 2 }; // Horizontal cuts (size n-1)

        // Sort in descending order for greedy selection
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1; // Initially, there's 1 horizontal and 1 vertical piece
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] >= costHor[h]) { // Vertical cut
                cost += costVer[v] * hp; // Multiply by current horizontal pieces
                vp++; // Increase vertical pieces
                v++;
            } else { // Horizontal cut
                cost += costHor[h] * vp; // Multiply by current vertical pieces
                hp++; // Increase horizontal pieces
                h++;
            }
        }

        // Process remaining horizontal cuts
        while (h < costHor.length) {
            cost += costHor[h] * vp;
            hp++;
            h++;
        }

        // Process remaining vertical cuts
        while (v < costVer.length) {
            cost += costVer[v] * hp;
            vp++;
            v++;
        }

        System.out.println("Min cost of cuts = " + cost);
    }
}
