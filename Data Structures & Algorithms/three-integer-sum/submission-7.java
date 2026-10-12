class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        int i = 0;
        while (i < nums.length - 2) {
            // skip duplicate i (i++ before continue, or the loop never advances)
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;
            int target = -nums[i];

            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum == target) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    // skip duplicate j and k
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
            i++;
        }

        return ans;
    }
}