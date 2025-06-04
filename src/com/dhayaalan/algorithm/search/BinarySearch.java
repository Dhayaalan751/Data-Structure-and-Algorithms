package algorithm.search;

public class BinarySearch {

    static boolean binarySearch(int[] arr,int k){
        int low = 0, high = (arr.length - 1);

        while(low <= high){

            int  mid = (low + high)/2;
            System.out.println(mid);
            if(arr[mid] == k){
                return true;
            }else if(arr[mid] > k) {
                low = mid + 1;
            }else if(arr[mid] < k) {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] arg){

        int[] arr = {1 ,2 ,3 ,4 ,6};
        int x = 6;

        System.out.print(binarySearch(arr,x));
    }
}
