
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
public class BinarySearch 
{ 
    
    public static void main (String[] args)  
    { 
        int arr[] = {10,9,8,7,6,5,4,3,2,1}; 
        int n = arr.length; 
        int key = 9;
        int loc=0;
        int pivot = countRotations(arr, 0, n-1);
        System.out.println(pivot);
        loc = findLocation(arr,pivot,key,n);
        
          
        System.out.println(loc+1); 
    } 
    static int findLocation(int arr[], int pivot, int key, int n){
        if (pivot == -1)
            return binarySearch(arr,0,n-1,key);
        if(arr[pivot] == key){
            return pivot;
        }
        if (arr[0] <= key) 
            return binarySearch(arr, 0, pivot-1, key); 
       return binarySearch(arr, pivot+1, n-1, key); 
    }
     static int countRotations(int arr[], int low, 
                                       int high) 
    { 
        
        if (high < low) 
            return -1; 
  
        if (high == low) 
            return low; 
        int mid = low + (high - low)/2;  
        System.out.println(mid);
        if (mid < high && arr[mid+1] < arr[mid]) {
            return (mid + 1); 
            
        }
        if (mid > low && arr[mid] < arr[mid - 1]) 
            return mid; 
        if (arr[high] > arr[mid]) 
            return countRotations(arr, low, mid - 1); 
  
        return countRotations(arr, mid + 1, high); 
    } 
    static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            if (arr[mid] == x) 
                return mid;  
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        return -1; 
    } 
  
} 