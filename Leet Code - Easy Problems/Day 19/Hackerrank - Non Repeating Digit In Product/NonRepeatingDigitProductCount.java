public class NonRepeatingDigitProductCount{
    public static int nonRepeatingDigitProductCount(int x, int y, int z) {
        int n=0;
        for(int i=y;i<=z;i++){
            int product = Math.multiplyExact(x, i);
            String iStr = String.valueOf(i);
            char[] prodArr = String.valueOf(product).toCharArray();
            boolean flag = false;
            for(Character ch : prodArr){
                if(iStr.indexOf(ch) != -1){
                    flag = true;
                }
            }
            if(!flag){
                n++;
            }
        }
        return n;
    }
}
