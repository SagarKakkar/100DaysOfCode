public class ReverseString {
    public void reverseString(char[] s) {
        int i,j;
        for(i=0,j=s.length-1;i<s.length/2;i++,j--){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
