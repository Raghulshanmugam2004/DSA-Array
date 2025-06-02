//https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        // Code Here
        int n= arr.length;
        int j=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j++]=arr[i];
                
            }
        }
        arr[j++]=arr[n-1];
        return j; 
    }
}
