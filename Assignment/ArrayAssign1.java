package Assignment;

import java.util.*;

public class ArrayAssign1 {
    public static boolean containDuplicate(int[] nums) {
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        boolean same_num = containDuplicate(nums);
        System.out.println(same_num);
    }
}
