
package LeetCode.Binary_Search;
import java.util.Scanner;

public class InfiniteArray{
    static int binarySearch(int[] arr, int target){
    int start=0;
    int end=arr.length-1;
    

    while(start<=end){

      int mid = start+ (end-start)/2;

      if(target<arr[mid]){

          end= mid-1;
          end = mid-1;
          
      }

      else if(target>arr[mid]){

          start= mid+1;
          start= mid+1;
    }

    else{

      return mid;
    }
    
  }
  return -1;
  

}
}