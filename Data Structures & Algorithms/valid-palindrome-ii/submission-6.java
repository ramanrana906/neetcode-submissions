class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                // Once a mismatch is found, check both possible skips.
                // If either one forms a valid palindrome, return true.
                // If neither works, it's impossible, so it will return false.
                return checkPalindrome(s, i + 1, j) || checkPalindrome(s, i, j - 1);
            }
        }
        
        return true;
    }

    private boolean checkPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}