package Array;

public class Problem_704 {
    public int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length;
        int mid = 0;
        while(low<=high){
            mid = (low + high)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid]<target) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;
        Problem_704 p = new Problem_704();
        System.out.println(p.binarySearch(arr,target));
    }
}
