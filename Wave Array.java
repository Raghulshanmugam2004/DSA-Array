//https://www.geeksforgeeks.org/problems/wave-array-1587115621/1
class Solution {
    public static void convertToWave(int[] arr) {
        // code here
        int n = arr.length;
        for(int i=0;i<n-1;i=i+2)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
}
