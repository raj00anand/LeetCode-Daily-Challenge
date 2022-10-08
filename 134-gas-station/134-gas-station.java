class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int start=0;
        int surplus=0;
        int total=0;
        for(int i=0;i<gas.length;i++){
            total += gas[i]-cost[i];
            surplus += gas[i]-cost[i];
            if(surplus<0){
                surplus=0;
                start=i+1;
            }
        }
        return total<0 ? -1: start;
        
    }
}