class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int lg = 0;
        for (int n : nums) {
            set.add(n);
            lg = Math.max(lg, n);
        }

        for (int i = 1; i <= lg; i++) {
            if (!set.contains(i)) return i;
        }
        return lg + 1;
    }
}