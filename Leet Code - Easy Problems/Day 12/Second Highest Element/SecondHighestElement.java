public class SecondHighestElement {
    public static int print2largest(int A[],int N) 
    {
        if(A.length < 2){
    	    return -1;
    	}
    	
    	int fMax=A[0];
    	int sMax=0;
    	for(int i=1;i<A.length;i++){
    	    if(fMax < A[i]){
    	        sMax = fMax;
    	        fMax = A[i];
    	    }else if(fMax != A[i] && sMax < A[i]){
    	        sMax = A[i];
    	    }
    	}
    	if(sMax == 0){
    	    return -1;
    	}
    	return sMax;
    }
}
