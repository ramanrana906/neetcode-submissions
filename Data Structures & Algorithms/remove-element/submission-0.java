class Solution {
    public int removeElement(int[] nums, int val) {
        int a = 0;
        int b = nums.length-1;

        
   while (a <= b) {
        if (nums[a] == val) {
            nums[a] = nums[b];
            b--;
        } else {
            a++;
        }
    }

    return a;
    }
}