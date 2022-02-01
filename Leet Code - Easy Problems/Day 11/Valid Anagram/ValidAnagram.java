import java.util.Map;

class ValidAnagaram {
    public boolean isAnagram(String s, String t) {
        // O(n) complexity
        Map<Character, Integer> smap = new HashMap<>();
        int sl = s.length();
        int tl = t.length();
        if(sl != tl){
            return false;
        }

        for(int i=0;i<sl;i++){
            smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i), 0)+1);
            smap.put(t.charAt(i),smap.getOrDefault(t.charAt(i), 0)-1);
        }

        for(char c : smap.keySet()){
            if(smap.get(c) != 0){
                return false;
            }
        }
        return true;
    }
}

/*
1. Using Arrays.sort() - O(n log n) complexity

        char[] tc=t.toCharArray();
        Arrays.sort(tc);
        char[] sc=s.toCharArray();
        Arrays.sort(sc);

        return Arrays.equals(tc,sc);

2. Using arrays - O(n) complexity

        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;

*/