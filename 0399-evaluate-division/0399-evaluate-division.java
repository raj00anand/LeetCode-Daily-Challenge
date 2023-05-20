class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, HashMap<String, Double>> graph = builtGraph(equations, values);
        double res[]=new double[queries.size()];
        for(int i=0;i<queries.size();i++){
            String dividend = queries.get(i).get(0);
            String divisor = queries.get(i).get(1);
            
            if(!graph.containsKey(dividend) || !graph.containsKey(divisor)){
                res[i]=-1.0;
            }else{
                HashSet<String> vis= new HashSet<>();
                double[] ans={-1.0};
                double temp=1.0;
                dfs(dividend, divisor, graph, vis, ans, temp);
                res[i]=ans[0];
            }
        }
        return res;
        
    }
    public void dfs(String start, String dest,HashMap<String, HashMap<String, Double>> graph, HashSet<String> vis, double[] ans, double temp){
        if(vis.contains(start)) return;
        
        vis.add(start);
        if(start.equals(dest)){
            ans[0]=temp;
            return;
        }
        
        for(String key: graph.get(start).keySet()){
            double val = graph.get(start).get(key);
            dfs(key, dest, graph, vis, ans, temp*val);
        }
        
    }
    public HashMap<String, HashMap<String, Double>> builtGraph(List<List<String>> equations, double values[]){
        HashMap<String, HashMap<String, Double>> graph = new HashMap<>();
        for(int i=0;i<equations.size();i++){
            String dividend = equations.get(i).get(0);
            String divisor = equations.get(i).get(1);
            
            graph.putIfAbsent(dividend, new HashMap<>());
            graph.putIfAbsent(divisor, new HashMap<>());
            
            graph.get(dividend).put(divisor, values[i]);
            graph.get(divisor).put(dividend, 1.0/values[i]);
        }
        
        return graph;
    }
}