//https://www.geeksforgeeks.org/problems/second-largest3735/1

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int first = -1;
        int second = -1;
        for(int i=0 ;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }
            else if( arr[i]>second && arr[i]!=first)
            {
                second=arr[i];
            }
        }
        return second;
    }
}
