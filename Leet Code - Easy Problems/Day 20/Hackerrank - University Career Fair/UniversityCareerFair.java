public class UniversityCareerFair {

    /*
     * Complete the 'maxEvents' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arrival
     *  2. INTEGER_ARRAY duration
     */

    public static int maxEvents(List<Integer> arrival, List<Integer> duration) {
        // Write your code here
        int drop=0;
        int numOfEvents = arrival.size();
        int[][] intervals = new int[numOfEvents][2];
        
        for(int i=0;i<numOfEvents;i++){
            intervals[i] = new int[]{arrival.get(i), arrival.get(i) + duration.get(i)};
        }
        
        Arrays.sort(intervals, (a,b) -> (a[1] - b[1]));
        int currTime = intervals[0][1];
        
        for(int j=1;j<numOfEvents;j++){
            int[] toSchedule = intervals[j];
            if(toSchedule[0] < currTime){
                drop++;
            }else{
                currTime=toSchedule[1];
            }
        }
        return numOfEvents - drop;

    }

}