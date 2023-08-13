class RecentCounter {
    Queue<Integer> que;

    public RecentCounter() {
        que = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        que.add(t);
        // boolean flag = false;
        while(que.peek()<t-3000){
            que.remove();
        }
        return que.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */