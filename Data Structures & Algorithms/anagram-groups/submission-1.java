class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>(strs.length);
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];

        for(String s : strs){
            sb.setLength(0);
            java.util.Arrays.fill(freq, 0);
            
            for(char ch : s.toCharArray()){
                freq[ch - 'a']++;
            }


            for(int i : freq){
                sb.append(i).append("#");
            }

            map.computeIfAbsent(sb.toString(), k -> new ArrayList<String>()).add(s);
        }

        return new ArrayList<List<String>>(map.values());
    }
}