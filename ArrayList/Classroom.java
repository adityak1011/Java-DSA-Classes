package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Classroom {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    // public static void main(String[] args) {
    //     //Java Collection Framework
    //     // ClassName objectName = new ClassName();
    //     ArrayList<Integer> list = new ArrayList<>(); 
    //     ArrayList<String> list2 = new ArrayList<>();
    //     ArrayList<Boolean> list3 = new ArrayList<>();

    //     //Add Element O(1)
    //     list.add(2);
    //     list.add(5);
    //     list.add(9);
    //     list.add(3);
    //     list.add(6);
/*
        // list.add(1, 9);
        // System.out.println(list);
        System.out.println(list.size());

        //print the arraylist
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        //Get Operation O(1)
        int element = list.get(2);
        System.out.println(element);

        //Remove Element O(n)
        list.remove(2);
        System.out.println(list);

        //Set Element at Index O(n)
        list.set(2, 10);
        System.out.println(list);

        //Contains Element O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
        */

        //Reverse print - O(n)
        // for(int i=list.size()-1; i>0; i--) {
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        //Find Maximum
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++) {
        //     if(max < list.get(i)) {
        //         max = list.get(i);
        //     }
        // }
        // System.out.println("max element = " + max);

        // Swap 2 Numbers
        // int idx = 1, idx2 = 3;
        // System.out.println(list);
        // swap(list, idx, idx2);
        // System.out.println(list);

    //     System.out.println(list);
    //     Collections.sort(list); //asending
    //     System.out.println(list);

    //     //descending
    //     System.out.println(list);
    //     Collections.sort(list, Collections.reverseOrder());
    //     System.out.println(list);
    // }

    // public static void main(String[] args) {
    //     ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    //     ArrayList<Integer> list = new ArrayList<>();
    //     list.add(1); list.add(2); 
    //     mainList.add(list);
        
    //     ArrayList<Integer> list2 = new ArrayList<>();
    //     list2.add(3); list2.add(4);
    //     mainList.add(list2);

    //     for(int i=0; i<mainList.size(); i++) {
    //         ArrayList<Integer> currList = mainList.get(i);
    //         for(int j=0; j<currList.size(); j++) {
    //             System.out.print(currList.get(j)+" ");
    //         }
    //         System.out.println();
    //     }

    //     System.out.println(mainList);
    // }

    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            list1.add(i*1); //1 2 3 4 5
            list2.add(i*2); // 2 4 6 8 10
            list3.add(i*3); // 3 6 9 12 15
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        //nested loops
        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
