class UndergroundSystem {
    HashMap<Integer, List<String>> checkIn;
    // HashMap<Integer, String> checkout;
    HashMap<List<String>, List<Integer>> overall;

    public UndergroundSystem() {
        checkIn = new HashMap<>();
        // checkout = new Hashmap<>();
        overall = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        List<String> str=new ArrayList<>(Arrays.asList(stationName, t+""));
        checkIn.put(id, str);
    }
    
    public void checkOut(int id, String stationName, int t) {
        List<String> temp = checkIn.get(id);
        String startName = temp.get(0);
        int startTime = Integer.parseInt(temp.get(1));
        List<String> str= new ArrayList<>(Arrays.asList(startName, stationName));
        if(!overall.containsKey(str)){
            List<Integer> list = new ArrayList<>();
            list.add(t-startTime);
            overall.put(str, list);
        }else{
            List<Integer> list = overall.get(str);
            list.add(t-startTime);
            overall.put(str, list);
        }
        // System.out.println(overall);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        double ans = 0.0;
        List<String> str= new ArrayList<>(Arrays.asList(startStation, endStation));
        List<Integer> list = overall.get(str);
        // System.out.println(list);
        for(int value: list){
            ans += value;
        }
        double res = ans/(list.size());
        return res;
        
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */