package 재귀;

import java.util.*;

class solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(new ArrayList<>(), nums,result);
        return result;
    }
    void backtrack(int[] nums) {


        for (int i= 0; i< nums.length; i++) {
            nums[i];
            backtrack(nums,result);
            nums[i];

        }
    }
}
