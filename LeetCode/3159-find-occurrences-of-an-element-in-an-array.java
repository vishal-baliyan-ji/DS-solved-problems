class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int max=0;
        for(int query:queries){
            max=Math.max(max,query);
        }
        int[] arr=new int[max+1];
        Arrays.fill(arr,-1);
        int count=1;
        for(int i =0;i<nums.length;i++){
            if(count>max) break;
            if(nums[i]==x){
                arr[count]=i;
                count++;
            }
        }
        for(int i =0;i<queries.length;i++){
            queries[i]=arr[queries[i]];
        }
        return queries;
    }
}