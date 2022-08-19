import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class StartEndIndex {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr={10,15,15,15,15,20,25,30,35,40,45,50};
        int target=in.nextInt();

        System.out.println(Arrays.toString(start_end_index(arr, target)));

    }

     static int[] start_end_index(int[] arr, int target) {
       int start= StartIndex(arr,target);
        int end=EndIndex(arr,target);
        int [] ans= {start, end};
        return ans;
    }

    static int EndIndex(int[] arr, int target) {
        int l=0;
        int h=arr.length-1;
        int position=-1;
        while(l<=h){
            int mid =(l+h)/2;
            if(arr[mid]==target){
                position=mid;
                l=mid+1;
            }
            else if(arr[mid]>target){
                h=mid-1;

            }else{
                l=mid+1;
            }
        }
        return position;
    }

    private static int StartIndex(int[] arr, int target) {
        int l=0;
        int h=arr.length-1;
        int position=-1;
        while(l<=h){
            int mid =(l+h)/2;
            if(arr[mid]==target){
                position=mid;
                h=mid-1;
            }
            else if(arr[mid]>target){
                h=mid-1;

            }else{
                l=mid+1;
            }
        }
        return position;

    }

    {

    }
}
