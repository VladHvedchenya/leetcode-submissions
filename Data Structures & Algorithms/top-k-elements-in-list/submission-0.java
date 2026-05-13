class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] res = new List[nums.length + 1];

        for(int i = 0; i < res.length; i++){
            res[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            res[entry.getValue()].add(entry.getKey());
        }

        int[] ans = new int[k];
        int index = 0;

        for(int i = res.length - 1; i > 0 && index < k; i--){        
            for(int num : res[i]){
                ans[index++] = num;

                if(index == k)
                    return ans;            
                
            }
        }

        return ans;
    }
}
