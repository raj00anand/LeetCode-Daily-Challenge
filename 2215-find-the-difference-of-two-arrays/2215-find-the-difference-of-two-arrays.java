class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int val: nums1){
            set1.add(val);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int val: nums2){
            set2.add(val);
        }
        List<Integer> answer1 = new ArrayList<Integer>();
        for(int val: nums2){
            if(!set1.contains(val) && !answer1.contains(val)){
                answer1.add(val);
            }
        }
        List<Integer> answer2 = new ArrayList<Integer>();
        for(int val: nums1){
            if(!set2.contains(val) && !answer2.contains(val)){
                answer2.add(val);
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(answer2);
        res.add(answer1);
        return res;
    }
}