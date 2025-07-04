package Com.binary_Interview;

public class infinitearray {
    public static void main(String[] args) {
        int[] arr={1,2,5,7,7,9,12,14,16,17,19,20,23,25,26,28,29};
        int target =9;
        System.out.println(infinite(arr,target ));
    }
    static int infinite(int[] arr, int target){
      int start=0;
      int end=1;

      while(target>arr[end]){
          int newStart=end +1;

          end = end+(end-start+1)*2;
          start=newStart;

      }
        return normalbinary(arr,target,start,end);
    }

    static int normalbinary(int[] arr,int target,int start,int end){

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target< arr[mid]) {
                end = mid- 1;
            } else if (target> arr[mid]) {
                start = mid+ 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
