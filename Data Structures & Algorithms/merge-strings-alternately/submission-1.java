class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";

        int i = 0 ;
        int n = word1.length();
        int m = word2.length();
        while( i < n || i < m)
        {
            if( i < n )
            {
                ans = ans+ word1.charAt(i);
            }
            if(i < m)
            {
ans = ans+ word2.charAt(i);
            }
             
             
             i++;
          
        }
       
        return ans;
    }
}