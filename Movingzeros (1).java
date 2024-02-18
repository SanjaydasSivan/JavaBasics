import java.util.Arrays;
class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int count = 0;
        int ind = 0;
   
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                nums[ind++] = nums[i];
            }
        }

        for (int i = ind + 1; i < len; i++) {
            nums[i] = 0;
        }

       System.gc();
    }
}

public class Movingzeros {
    public static void main(String[] args) {
        int[] nums = {1, 3, 12, 0, 0, 2, 1};
        Solution solution = new Solution();
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}