class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer>map = new HashMap<>();

        for( int i = 0 ; i < nums.length ; i++)
        {
          map.merge(nums[i], 1, Integer::sum);
        }

        int majority = 0;
        int majorityElement = 0;

        // Standard loop allows updating local variables
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > majority) {
                majority = entry.getValue();
                majorityElement = entry.getKey();
            }
        }

        return majorityElement;

    }
}