class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Hashtable<String, List<String>> table = new Hashtable<>();

        for( int i = 0 ; i < strs.length; i++)
        {
              String word = strs[i];
              char[] chars = word.toCharArray();
              Arrays.sort(chars);
              String sortedWord = new String(chars);

              if(table.containsKey(sortedWord))
              {
                List<String> resultList = table.get(sortedWord);
                resultList.add(word);
              }
              else
              {
                List<String> newList = new ArrayList<>();
                newList.add(word);
                table.put(sortedWord, newList);
              }  
        }

     List<List<String>> combinedList = new ArrayList<>();

table.forEach((key, subList) -> {
    if (subList != null) {
        combinedList.add(subList); // Changed addAll to add
    }
});

return combinedList;
    }
}
