package Com.binary_Interview;

public class CountRotation {
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,0,1,2};
        System.out.println(RotationCount(arr));
    }
    static int RotationCount(int[] arr){
        int pivot = pivot(arr);
        return pivot+1;
    }

    static int pivot(int[] arr){
        int start =0;
        int end= arr.length-1;

        while(start<=end){

            int mid = start +(end -start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid < start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]<arr[mid]){
                end = mid-1;
            }
            else {
               start = mid+1;
            }
        }
        return -1;
    }

    static int DupliPivot(int [] arr){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end - start)/2;

            if(mid<end && arr[mid]< arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]< arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]== arr[start]&& arr[mid]== arr[end]){
                if(arr[start]> arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            if (arr[start]<arr[mid] || arr[mid]==arr[start] && arr[mid]>arr[end]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
