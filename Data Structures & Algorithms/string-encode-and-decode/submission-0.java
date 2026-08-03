class Solution {
    public String encode(List<String> strs) {
         StringBuilder encode = new StringBuilder();
        for (String str : strs) {
           
            encode.append(str.length());
            encode.append('#');

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                encode.append(ch);
            }

           
        }

        return encode.toString();
    }

      public List<String> decode(String str) {

        List<String> ans = new ArrayList<>();

        for( int i = 0 ; i < str.length(); ) // Removed i++ to manual control
        {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;

            StringBuilder internal = new StringBuilder();
            for( int k = 0 ; k < length ; k++)
            {
                internal.append(str.charAt(i + k));
            }

            ans.add(internal.toString());
            i += length; // Move i to the start of the next length prefix
        }

        return ans;
      }
}