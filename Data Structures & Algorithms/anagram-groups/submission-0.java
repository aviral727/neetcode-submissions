class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> aMap = new HashMap<>();

        for(int i = 0; i<strs.length;i++){
            String s = strs[i];
            char[] cA = s.toCharArray();
            Arrays.sort(cA);
            String fS = String.valueOf(cA);
            if(aMap.containsKey(fS)){
                aMap.get(fS).add(s);
            }
            else {
                List<String> temp = new ArrayList<>();
                temp.add(s);
                aMap.put(fS,temp);
            }

        }
        // Collection<String> fList = aMap.values(); 
        // fList = aMap.values();
        return new ArrayList<>(aMap.values());
      }
}
