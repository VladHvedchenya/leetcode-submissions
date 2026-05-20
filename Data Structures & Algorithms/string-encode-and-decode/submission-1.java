class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder(strs.size());

        for(String str : strs)
            sb.append(str.length()).append("#").append(str);

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < str.length()){
            while(str.charAt(i) != '#'){
                i++;
            }

            int len = Integer.parseInt(str.substring(j, i));

            String word = str.substring(i + 1, i + 1 + len);
            res.add(word);
            i = i + len + 1;
            j = i;

        }

        return res;
    }
}
