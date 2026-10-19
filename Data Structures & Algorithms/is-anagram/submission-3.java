class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
        for (char c : s.toCharArray()){
            int count1 = map1.getOrDefault(c,0);
            count1 = count1 + 1;
            map1.put( c,count1 ) ;
        }
        for (char b : t.toCharArray()){
            int count2 = map2.getOrDefault(b,0);
            count2 = count2 + 1;
            map2.put( b, count2 ) ;
        }
        for (char c : s.toCharArray()){
            if (!Objects.equals(map1.get(c), map2.get(c))){
                return false;
            }
        }
        for (char b : t.toCharArray()){
            if (!Objects.equals(map1.get(b), map2.get(b))){
                return false;
            }
        }

        return true;
    }
}
