// Goldman Sachs Question12 - https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1/


import java.util.*; 
class Que11 {
    public static void main(String[] args) {
        int[] arr = {2, 1};
        int n = 2;

       System.out.println(findTwoElement(arr, n));
        
    }

    static int[] findTwoElement(int arr[], int n) {
        int[] result = new int[2];
        int originalSum = 0;
        int curSum = 0;
        
        for(int i = 0; i < n; i++) {
            int ele = Math.abs(arr[i]);
            int index = ele - 1;
            
            if(arr[index] < 0) {
                result[0] = ele;
            }
            
            arr[index] = -arr[index];
            originalSum += i + 1;
            curSum += ele; 
        }
        
        result[1] = originalSum - (curSum - result[0]);
        return result;
          
    }
    
}
