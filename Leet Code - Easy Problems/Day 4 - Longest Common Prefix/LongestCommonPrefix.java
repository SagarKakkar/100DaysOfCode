class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){ // This method returns the index within this string of the first occurrence of the specified substring. If it does not occur as a substring, -1 is returned
                prefix=prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}