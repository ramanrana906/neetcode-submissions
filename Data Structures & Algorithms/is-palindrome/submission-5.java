class Solution {
    public boolean isPalindrome(String s) {
         StringBuilder st = new StringBuilder("");

            for(int i  = 0 ; i < s.length(); i++)
            {
                char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                
                // 2. Convert to lowercase and append to the StringBuilder
                st.append(Character.toLowerCase(ch));
            }
            }
            
            int i = 0;
            int j = st.length()-1;
            // if(st.length() == 1)
            // {
            //     return false;
            // }
            while(i<j)
            {
                if(st.charAt(i) != st.charAt(j))
                {
                    return false;
                }
                i++;
                j--;
            }
            return true;

    }
}
