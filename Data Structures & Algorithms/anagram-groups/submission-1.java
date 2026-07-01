class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> table = new HashMap<>();

        for( int i = 0 ; i < strs.length; i++)
        {
              String word = strs[i];
              char[] chars = word.toCharArray();
              Arrays.sort(chars);
              String sortedWord = new String(chars);
            table.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);

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
