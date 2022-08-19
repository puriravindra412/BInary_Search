import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr = {10,20,40,50,60,70,80,90};
        int target=in.nextInt();
        System.out.println(binary_seacrh(arr,target));

    }

    private static int  binary_seacrh(int arr[], int target) {
        int l=0;
        int h=arr.length;
        while(l<=h){
            int mid =(l+h)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return 0;

    }
}