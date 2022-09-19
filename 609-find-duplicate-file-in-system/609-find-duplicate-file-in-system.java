class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map=new HashMap<>();
        for(String path: paths){
            String[] files=path.split(" ");
            for(int i=1;i<files.length;i++){
                String[] contents=files[i].split("\\(");
                contents[1]=contents[1].replace(")","");
                List<String> list=map.getOrDefault(contents[1], new ArrayList<String>());
                list.add(files[0]+"/"+contents[0]);
                map.put(contents[1], list);
            }
        }
        List<List<String>> res=new ArrayList<>();
        for(String key: map.keySet()){
            if(map.get(key).size()>1){
                res.add(map.get(key));
            }
        }
        return res;
    }
}