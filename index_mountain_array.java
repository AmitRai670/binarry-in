package Com.binary_Interview;

public class index_mountain_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderagonstic(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderagonstic(arr,target,peak+1,arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end= arr.length-1;

        while(start<end){
            int mid = start +(end-start)/2;

            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    static int orderagonstic(int[] arr , int target , int start,int end){


        boolean isAsc =arr[start] < arr[end];

        while (start<=end){
            int mid= start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;

                }
            }


        }
        return -1;
    }
}
