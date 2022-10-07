class MyCalendarThree {
    private Map<Integer, Integer> diff;
    public MyCalendarThree() {
        diff=new TreeMap<>();
    }
    
    public int book(int start, int end) {
        diff.put(start, diff.getOrDefault(start,0)+1);
        diff.put(end, diff.getOrDefault(end, 0)-1);
        int cur=0, res=0;
        for(int delta: diff.values()){
            cur += delta;
            res = Math.max(cur, res);
        }
        return res;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */