class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res=new ArrayList<>();
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int val: nums1){
            set1.add(val);
        }
        for(int val: nums2){
            set2.add(val);
        }
        List<Integer> list1 = new ArrayList<>();
        for(int val: nums1){
            if(!set2.contains(val) && !list1.contains(val)){
                list1.add(val);
            }
        }
        List<Integer> list2 = new ArrayList<>();
        for(int val: nums2){
            if(!set1.contains(val) && !list2.contains(val)){
                list2.add(val);
            }
        }
        res.add(list1);
        res.add(list2);
        return res;
        
        
    }
}