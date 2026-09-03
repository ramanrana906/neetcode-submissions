class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        if(nums.length ==1)
        {
            ans.add(nums[0]);
        }
          if(nums.length ==2)
        {
            ans.add(nums[0]);
            ans.add(nums[1]);
        }

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (map.containsKey(key)) {
                Integer currentValue = map.get(key);
                map.put(key, map.get(key) + 1);
                if (currentValue >= nums.length / 3 && !ans.contains(key)) {
                    ans.add(key);
                }
            } else {
                map.put(key, 1);
            }
        }

        return ans;
    }
}