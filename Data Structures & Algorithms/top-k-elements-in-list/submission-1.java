class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

    for( int i = 0 ; i < k  ; i++)
    {
        int max = Integer.MIN_VALUE;
        int maxkey  = 0;
         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           
          int value = entry.getValue();
          int key = entry.getKey();

          if(value > max)
          {
            max = value;
            maxkey = key;
          }


        }

        ans[i] = maxkey;
        map.remove(maxkey);
    }

    return ans;
       
    }
}
