package Com.binary_Interview;

public class Cilling {
    public static void main(String[] args){
        int [] arr ={2,3,5,9,14,16,18};
        int aim=15;
        int ans = bcilling(arr,aim);
        System.out.println(ans);

    }

    static int bcilling(int[] arr, int aim){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start +(end-start)/2;

            if(aim==arr[mid]){
                return mid;
            }
            else if(aim>arr[mid]){
                start=mid+1;
            }
            else if(aim<arr[mid]){
                end=mid-1;
            }
        }
         //return start;  // ceiling
        return end;   //flooring
    }
}
