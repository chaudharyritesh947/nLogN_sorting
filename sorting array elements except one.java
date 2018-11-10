
// Java program to sort all elements except 
// element at index k. 
import java.util.Arrays; 
  
class GFG { 
      
    static int sortExceptK(int arr[], int k, int n) 
    { 
          
        // Move k-th element to end 
        int temp = arr[k]; 
        arr[k] = arr[n-1]; 
        arr[n-1] = temp; 
      
        // Sort all elements except last 
        Arrays.sort(arr, 0, n-1); 
      
        // Store last element (originally k-th) 
        int last = arr[n-1]; 
      
        // Move all elements from k-th to one 
        // position ahead. 
        for (int i = n-1; i > k; i--) 
        arr[i] = arr[i-1]; 
      
        // Restore k-th element 
        arr[k] = last; 
        return 0; 
    } 
      
    //Driver code 
    public static void main (String[] args) 
    { 
        int a[] = {10, 4, 11, 7, 6, 20 }; 
        int k = 2; 
        int n = a.length; 
          
        sortExceptK(a, k, n); 
          
        for (int i = 0; i < n; i++) 
            System.out.print(a[i] + " "); 
    } 
} 