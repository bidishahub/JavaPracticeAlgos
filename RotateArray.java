import java.util.Arrays; 
public class RotateArray { 
	public static void rotateArr(Integer[] arr, int n) { 
        if(n >= arr.length) 
            n -= arr.length; 
        if(arr == null || arr.length < 2 || n==0) 
            return; 
        rotateArr(arr, n, arr.length); 
    } 
    private static void rotateArr(Integer[] arr, int k, int n) { 
        if(n <= 0) 
            return; 
        int cur = arr[--n]; 
        k = (arr.length+k-1) % arr.length; 
        rotateArr(arr, k, n); 
        arr[k] = cur; 
    } 
    public static void main(String[] args) { 
        Integer[] arr = {43,6,18,48,4,2,1}; 
        rotateArr(arr, 9); 
        System.out.println(Arrays.toString(arr)); 
    } 
} 