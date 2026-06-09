class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();
        boolean ans = true;
        if( s.length()  != t.length())
        {
            return false;
        }

        for( int i = 0 ; i < s.length() ; i++)
        {
           char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
            else
            {
                map.put(ch, 1);
            }
        }

         for( int i = 0 ; i < t.length() ; i++)
        {
           char ch = t.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
            }
            else
            {
                map.put(ch, 1);
            }
        }

            for (int value : map.values())
             {
                if (value != 0) {
                ans = false;
                   break;
                }
             }

        return ans;
    }
}
