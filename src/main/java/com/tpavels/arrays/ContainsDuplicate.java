package com.tpavels.arrays;

import java.util.HashSet;
import java.util.Set;

// 217
public class ContainsDuplicate {

    /*
         Runtime: 7 ms, faster than 89.57% of Java online submissions for Contains Duplicate.
         Memory Usage: 68.2 MB, less than 71.08% of Java online submissions for Contains
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Object> objects = new HashSet<>();
        for (int num : nums) {
            if (!objects.add(num)) {
                return true;
            }
        }
        return false;
    }

}
