// LeetCode problem 34
public class FirstandLastPosition_34 {
    static int firstOccurance(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        int first=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                first= mid;
                end=mid-1;
            }
            else if(key>arr[mid]){
                start=mid+1;
                
            }
            else{
                end=mid-1;
            }
            
        }
        return first;
            
    }
    static int lastOccurance(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        int last=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                last= mid;
                start=mid+1;
            }
            else if(key>arr[mid]){
                start=mid+1;
                
            }
            else{
                end=mid-1;
            }
            
        }
        return last;
            
    }
    public static int[] searchRange(int[] nums, int target) {
        int first=firstOccurance(nums,target);
        int last=lastOccurance(nums,target);
        return new int[] {first,last};
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,5,5,6,7,8,9,10};
        int[] result=searchRange(arr, 5);
        for(int a:result){
            System.out.println(a);
        }
    }
}
