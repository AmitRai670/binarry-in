package Com.binary_Interview;

public class pivot {

    public static void main(String[] args) {

        int[] arr = {3,5,1};
        int target= 3;
        int ans =  search(arr,target);
        System.out.println(ans);
    }

      static  int search(int[] nums, int target) {
        int pivot=Searchpivoit(nums);
        if(pivot == -1){
            return Search2(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return Search2(nums ,target,0,pivot-1);
        }
        else{
            return Search2(nums ,target,pivot+1,nums.length-1);
        }
    }

    static int Searchpivoit(int[] arr){
     int start =0;
     int end = arr.length-1;

     while(start<=end){
         int mid = start+(end-start)/2;
         if(mid < end && arr[mid]>arr[mid+1]){
             return mid;
         }
         if (mid > start && arr[mid]<arr[mid-1]){
             return mid-1;
         }
         if (arr[mid] <= arr[start]) {
            end = mid -1;
         }
         else{
             start = mid+1;
         }
     }
     return -1;
    }

    static int Search2(int[] arr,int target,int start,int end){
        while (start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else {
               return mid;
            }
        }
        return -1;
    }




}
