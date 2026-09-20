class Solution {
    public long countIntersectingIntervals(int[][] nums) {
        Arrays.sort(nums,(a,b)-> Integer.compare(a[0],b[0]));
        
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i][0];
        }
        long count=0;
        
        for(int i=0;i<nums.length-1;i++){
            int check=nums[i][1];
            int l=i+1;
            int h=nums.length-1;
            int mid=Integer.MAX_VALUE;
            int temp=0;
            while(l<=h){
                mid=l+(h-l)/2;
                if(arr[mid]==check){
                    temp=mid;
                    l=mid+1;
                    //System.out.println("Called eql");
                }
                else if(arr[mid]<check){
                    temp=mid;
                    l=mid+1;
                    //System.out.println("Called less");
                }
                else{
                    h=mid-1;
                    //System.out.println("Called great");
                }
            }
            if(temp>i){
                count+=(temp-i);
            }
            //System.out.println(temp+" "+i);
        }
        //if(count<0) return 0;
        return count;
    }
}