class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>(strs.length);

        for(String s : strs){
            int[] freq = new int[26];

            for(char ch : s.toCharArray()){
                freq[ch - 'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for(int i : freq){
                sb.append(i).append("#");
            }

            map.computeIfAbsent(sb.toString(), k -> new ArrayList<String>()).add(s);
        }

        return new ArrayList<List<String>>(map.values());
    }
}