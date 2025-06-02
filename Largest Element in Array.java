//https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1
class Solution {
    public static int largest(int[] arr) {
        // code here
        int large=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                large=arr[i];
            }
        }
        return large;
    }
}
