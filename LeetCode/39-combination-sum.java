class Solution {
    Set<List<Integer>>  res =new HashSet<>();
    List<Integer> l1=new ArrayList<>();
    int sum=0;
    public void insertVal(int[] nums, int target) {
        if(sum>target) return;
        for(int i =0;i<nums.length;i++){
            l1.add(nums[i]);
            sum+=nums[i];
            if(sum==target){
                Collections.sort(l1);
                res.add(new ArrayList(l1));
            }
            insertVal(nums,target);
            sum-=nums[i];
            l1.remove(Integer.valueOf(nums[i]));
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        insertVal(nums,target);
        return new ArrayList(res);
    }
}