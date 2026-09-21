class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> anagramMap = new HashMap<>();
       List<List<String>> output = new ArrayList<>();
       for(String s:strs){
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        if(anagramMap.containsKey(sortedString)){
            List<String> anagramList = anagramMap.get(sortedString);
            anagramList.add(s);
        } else {
            List<String> anagramList = new ArrayList<>();
            anagramList.add(s);
            anagramMap.put(sortedString,anagramList);
        }
       }
       for(List<String> value:anagramMap.values()){
            output.add(value);
       }
       return output;
    }
}
